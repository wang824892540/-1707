package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarBrand;
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
	public List<CarBrand> getAll() {
		// TODO Auto-generated method stub
		return carBrandDao.getAll();
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
	public List<CarBrand> getCarBrandByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carBrandDao.getCarBrandByIsDel(isDel);
	}

}
