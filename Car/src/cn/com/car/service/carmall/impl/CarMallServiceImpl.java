package cn.com.car.service.carmall.impl;

import java.util.List;

import cn.com.car.bean.CarModel;
import cn.com.car.dao.CarMall.CarMallDaoInf;
import cn.com.car.dao.CarMall.impl.CarMallDaoImpl;
import cn.com.car.service.carmall.CarMallServiceInf;


/**
 * 汽车商城服务实现类
 * @author 侯晓伟
 *
 */
public class CarMallServiceImpl implements CarMallServiceInf{
	/**
	 * 获得所有
	 */
	@Override
	public List<CarModel> getAll() {
		// TODO Auto-generated method stub
		CarMallDaoInf cmi = new CarMallDaoImpl();
		return cmi.getAll();
	}

	
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int del() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 通过信息查询汽车型号
	 */
	@Override
	public List<CarModel> getCarModelByInfo(String info) {
		// TODO Auto-generated method stub
		CarMallDaoInf cmi = new CarMallDaoImpl();
		return cmi.getCarModelByInfo(info);
	}

}
