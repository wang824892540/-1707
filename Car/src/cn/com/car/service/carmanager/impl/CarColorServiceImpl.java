package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarColor;
import cn.com.car.bean.PageBean;
import cn.com.car.dao.carmanager.CarColorDao;
import cn.com.car.dao.carmanager.impl.CarColorDaoImpl;
import cn.com.car.service.carmanager.CarColorService;

/**
 * 汽车颜色Service实现类
 * @author 单苏娜
 *
 */
public class CarColorServiceImpl implements CarColorService {

	private CarColorDao carColorDao = new CarColorDaoImpl();

	@Override
	public CarColor getCarColorById(Integer id) {
		// TODO Auto-generated method stub
		return carColorDao.getCarColorById(id);
	}

	@Override
	public int del(CarColor carColor) {
		// TODO Auto-generated method stub
		return carColorDao.del(carColor);
	}

	@Override
	public int update(CarColor carColor) {
		// TODO Auto-generated method stub
		return carColorDao.update(carColor);
	}

	@Override
	public int add(CarColor carColor) {
		// TODO Auto-generated method stub
		return carColorDao.add(carColor);
	}


	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return carColorDao.getCount();
	}

	@Override
	public int getCountByName(String name) {
		// TODO Auto-generated method stub
		return carColorDao.getCountByName(name);
	}

	@Override
	public int getCountByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carColorDao.getCountByIsDel(isDel);
	}

	@Override
	public List<CarColor> getAll(Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carColorDao.getAll(currentPage, maxResult);
	}

	@Override
	public List<CarColor> getCarColorByName(String name, Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carColorDao.getCarColorByName(name, currentPage, maxResult);
	}

	@Override
	public List<CarColor> getCarColorByIsDel(Integer isDel,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carColorDao.getCarColorByIsDel(isDel, currentPage, maxResult);
	}
	
	
	public void setPageBean(PageBean<CarColor> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carColorDao.getCount();
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
		List<CarColor> carColorList = carColorDao.getAll(pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carColorList);
	}

	@Override
	public void setPageBeanByName(String name,PageBean<CarColor> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carColorDao.getCountByName(name);
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
		List<CarColor> carColorList = carColorDao.getCarColorByName(name, pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carColorList);
	}

	@Override
	public void setPageBeanByIsDel(Integer isDel,PageBean<CarColor> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carColorDao.getCountByIsDel(isDel);
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
		List<CarColor> carColorList = carColorDao.getCarColorByIsDel(isDel, pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carColorList);
	}

}
