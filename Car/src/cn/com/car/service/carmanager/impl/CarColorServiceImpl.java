package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarColor;
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
	public List<CarColor> getAll() {
		// TODO Auto-generated method stub
		return carColorDao.getAll();
	}

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
	public List<CarColor> getCarColorByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carColorDao.getCarColorByIsDel(isDel);
	}

}
