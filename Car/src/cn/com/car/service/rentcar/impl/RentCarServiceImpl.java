package cn.com.car.service.rentcar.impl;

import java.util.List;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.bean.RentCarBean;
import cn.com.car.dao.buycar.BuyCarDaoInf;
import cn.com.car.dao.buycar.impl.BuyCarDaoImpl;
import cn.com.car.dao.rentCar.RentCarDaoInf;
import cn.com.car.dao.rentCar.impl.RentCarDaoImpl;
import cn.com.car.service.buycar.BuyCarServiceInf;
import cn.com.car.service.rentcar.RentCarServiceInf;


/**
 * 汽车商城服务实现类
 * @author 侯晓伟
 *
 */
public class RentCarServiceImpl implements RentCarServiceInf{
	/**
	 * 获得所有
	 */
	@Override
	public List<RentCarBean> getAll() {
		// TODO Auto-generated method stub
		RentCarDaoInf cmi = new RentCarDaoImpl();
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
	public List<RentCarBean> getCarInfoByInfo(String info) {
		// TODO Auto-generated method stub
		RentCarDaoInf cmi = new RentCarDaoImpl();
		return cmi.getCarInfoByInfo(info);
	}

}
