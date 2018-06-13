package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarBrand;
import cn.com.car.bean.PageBean;
import cn.com.car.dao.carmanager.CarBrandDao;
import cn.com.car.dao.carmanager.impl.CarBrandDaoImpl;
import cn.com.car.service.carmanager.CarBrandService;

/**
 * 汽车品牌Service实现类
 * @author 单苏娜
 *
 */
public class CarBrandServiceImpl implements CarBrandService {
	private CarBrandDao  carBrandDao = new CarBrandDaoImpl(); 
	
	@Override
	public List<CarBrand> getAll(Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carBrandDao.getAll(currentPage, maxResult);
	}

	@Override
	public CarBrand getCarBrandById(Integer id) {
		// TODO Auto-generated method stub
		return carBrandDao.getCarBrandById(id);
	}

	@Override
	public int del(CarBrand carBrand) {
		// TODO Auto-generated method stub
		return carBrandDao.del(carBrand);
	}

	@Override
	public int update(CarBrand carBrand) {
		// TODO Auto-generated method stub
		return carBrandDao.update(carBrand);
	}

	@Override
	public int add(CarBrand carBrand) {
		// TODO Auto-generated method stub
		return carBrandDao.add(carBrand);
	}

	@Override
	public List<CarBrand> getCarBrandByIsDel(Integer isDel,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carBrandDao.getCarBrandByIsDel(isDel, currentPage, maxResult);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return carBrandDao.getCount();
	}

	@Override
	public int getCountByName(String name) {
		// TODO Auto-generated method stub
		return carBrandDao.getCountByName(name);
	}

	@Override
	public int getCountByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carBrandDao.getCountByIsDel(isDel);
	}

	@Override
	public List<CarBrand> getCarBrandByName(String name, Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		return carBrandDao.getCarBrandByName(name, currentPage, maxResult);
	}

	@Override
	public void setPageBean(PageBean<CarBrand> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carBrandDao.getCount();
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
		List<CarBrand> carBrandList = carBrandDao.getAll(pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carBrandList);
	}

	@Override
	public void setPageBeanByName(String name, PageBean<CarBrand> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carBrandDao.getCountByName(name);
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
		List<CarBrand> carBrandList = carBrandDao.getCarBrandByName(name, pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carBrandList);
	}

	@Override
	public void setPageBeanByIsDel(Integer isDel, PageBean<CarBrand> pageBean, String pageNow) {
		// TODO Auto-generated method stub
		//算出总页数
		int dateNum = carBrandDao.getCountByIsDel(isDel);
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
		List<CarBrand> carBrandList = carBrandDao.getCarBrandByIsDel(isDel, pageBean.getCurrentPage(), pageBean.getMaxCount());
		//将要分页的数据封装在PageBean中
		pageBean.setDatas(carBrandList);
	}

}
