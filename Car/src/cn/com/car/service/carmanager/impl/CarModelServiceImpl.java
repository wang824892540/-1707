package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarModel;
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
	public List<CarModel> getAll() {
		// TODO Auto-generated method stub
		return carModelDao.getAll();
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
	public List<CarModel> getCarModelByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carModelDao.getCarModelByIsDel(isDel);
	}

}
