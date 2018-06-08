package cn.com.car.service.buycar.impl;

import java.util.List;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.dao.buycar.BuyCarDaoInf;
import cn.com.car.dao.buycar.impl.CarMallDaoImpl;
import cn.com.car.service.buycar.BuyCarServiceInf;


/**
 * 汽车商城服务实现类
 * @author 侯晓伟
 *
 */
public class BuyCarServiceImpl implements BuyCarServiceInf{
	/**
	 * 获得所有
	 */
	@Override
	public List<BuyCarBean> getAll() {
		// TODO Auto-generated method stub
		BuyCarDaoInf cmi = new CarMallDaoImpl();
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
	public List<BuyCarBean> getCarModelByInfo(String info) {
		// TODO Auto-generated method stub
		BuyCarDaoInf cmi = new CarMallDaoImpl();
		return cmi.getCarModelByInfo(info);
	}

}
