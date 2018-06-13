package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarType;
import cn.com.car.dao.carmanager.CarTypeDao;
import cn.com.car.dao.carmanager.impl.CarTypeDaoImpl;
import cn.com.car.service.carmanager.CarTypeService;

/**
 * 汽车类型Service实现类
 * @author 单苏娜
 *
 */
public class CarTypeServiceImpl implements CarTypeService {

	private CarTypeDao carTypeDao = new CarTypeDaoImpl();
	
	@Override
	public List<CarType> getAll() {
		// TODO Auto-generated method stub
		return carTypeDao.getAll();
	}

	@Override
	public CarType getCarTypeById(Integer id) {
		// TODO Auto-generated method stub
		return carTypeDao.getCarTypeById(id);
	}

	@Override
	public int del(CarType carType) {
		// TODO Auto-generated method stub
		return carTypeDao.del(carType);
	}

	@Override
	public int update(CarType carType) {
		// TODO Auto-generated method stub
		return carTypeDao.update(carType);
	}

	@Override
	public int add(CarType carType) {
		// TODO Auto-generated method stub
		return carTypeDao.add(carType);
	}

	@Override
	public List<CarType> getCarTypeByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carTypeDao.getCarTypeByIsDel(isDel);
	}

	@Override
	public List<CarType> getCarTypeByName(String name) {
		// TODO Auto-generated method stub
		return carTypeDao.getCarTypeByName(name);
	}

}
