package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarModel;
import cn.com.car.bean.PageBean;
import cn.com.car.dao.carmanager.CarModelDao;
import cn.com.car.dao.carmanager.impl.CarModelDaoImpl;
import cn.com.car.service.carmanager.CarModelService;

/**
 * 汽车型号Service实现类
 * @author 单苏娜
 *
 */
public class CarModelServiceImpl implements CarModelService {

	private CarModelDao carModelDao = new CarModelDaoImpl();
	
	@Override
	public List<CarModel> getAll(Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carModelDao.getAll(currentPage, maxResult);
	}

	@Override
	public CarModel getCarModelById(Integer id) {
		// TODO Auto-generated method stub
		return carModelDao.getCarModelById(id);
	}

	@Override
	public int del(CarModel carModel) {
		// TODO Auto-generated method stub
		return carModelDao.del(carModel);
	}

	@Override
	public int update(CarModel carModel) {
		// TODO Auto-generated method stub
		return carModelDao.update(carModel);
	}

	@Override
	public int add(CarModel carModel) {
		// TODO Auto-generated method stub
		return carModelDao.add(carModel);
	}

	@Override
	public List<CarModel> getCarModelByIsDel(Integer isDel,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carModelDao.getCarModelByIsDel(isDel, currentPage, maxResult);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return carModelDao.getCount();
	}

	@Override
	public int getCountByName(String name) {
		// TODO Auto-generated method stub
		return carModelDao.getCountByName(name);
	}

	@Override
	public int getCountByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carModelDao.getCountByIsDel(isDel);
	}
	
	@Override
	public void setPageBean(PageBean<CarModel> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carModelDao.getCount();
		int pageTotal = dateNum%pageBean.getMaxCount() == 0 ? dateNum/pageBean.getMaxCount() : dateNum/pageBean.getMaxCount() + 1;
		//将数据封装到PageBean中
		pageBean.setPageNum(pageTotal);
		if(pageNow!=null){
			pageBean.setCurrentPage(Integer.parseInt(pageNow));//设置当前页
		}
		//如果当前页小于1
		if(pageBean.getCurrentPage() < 1){
			//设置为默认当前页
			pageBean.setCurrentPage(1);
		}
		//如果当前页大于总页数
		if(pageBean.getCurrentPage() > pageTotal){
			//设置尾页
			pageBean.setCurrentPage(pageBean.getPageNum());
		}
		//进行分页
		List<CarModel> carModelList = carModelDao.getAll(pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carModelList);
	}

	@Override
	public void setPageBeanByIsDel(Integer isDel, PageBean<CarModel> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carModelDao.getCountByIsDel(isDel);
		int pageTotal = dateNum%pageBean.getMaxCount() == 0 ? dateNum/pageBean.getMaxCount() : dateNum/pageBean.getMaxCount() + 1;
		//将数据封装到PageBean中
		pageBean.setPageNum(pageTotal);
		if(pageNow!=null){
			pageBean.setCurrentPage(Integer.parseInt(pageNow));//设置当前页
		}
		//如果当前页小于1
		if(pageBean.getCurrentPage() < 1){
			//设置为默认当前页
			pageBean.setCurrentPage(1);
		}
		//如果当前页大于总页数
		if(pageBean.getCurrentPage() > pageTotal){
			//设置尾页
			pageBean.setCurrentPage(pageBean.getPageNum());
		}
		//进行分页
		List<CarModel> carModelList = carModelDao.getCarModelByIsDel(isDel, pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carModelList);
	}

}
