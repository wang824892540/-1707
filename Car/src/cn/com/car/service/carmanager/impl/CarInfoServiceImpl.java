package cn.com.car.service.carmanager.impl;

import java.util.List;

import cn.com.car.bean.CarInfo;
import cn.com.car.dao.carmanager.CarInfoDao;
import cn.com.car.dao.carmanager.impl.CarInfoDaoImpl;
import cn.com.car.service.carmanager.CarInfoService;

/**
 * 汽车基本信息Service实现类
 * @author 单苏娜
 *
 */
public class CarInfoServiceImpl implements CarInfoService {
	private CarInfoDao carInfoDao = new CarInfoDaoImpl();
	@Override
	public List<CarInfo> getAll() {
		// TODO Auto-generated method stub
		return carInfoDao.getAll();
	}

	@Override
	public CarInfo getCarInfoById(Integer id) {
		// TODO Auto-generated method stub
		return carInfoDao.getCarInfoById(id);
	}

	@Override
	public int del(CarInfo carInfo) {
		// TODO Auto-generated method stub
		return carInfoDao.del(carInfo);
	}

	@Override
	public int update(CarInfo carInfo) {
		// TODO Auto-generated method stub
		return carInfoDao.update(carInfo);
	}

	@Override
	public int add(CarInfo carInfo) {
		// TODO Auto-generated method stub
		return carInfoDao.add(carInfo);
	}

	@Override
	public List<CarInfo> getCarInfoByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		return carInfoDao.getCarInfoByIsDel(isDel);
	}

}
