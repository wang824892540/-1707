package cn.com.car.dao.CarMall.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.CarModel;
import cn.com.car.dao.CarMall.CarMallDaoInf;
import cn.com.car.utils.ComPoolUtil;
	
/**
 * 汽车商城数据操作实现类
 * @author 侯晓伟
 *
 */
public class CarMallDaoImpl implements CarMallDaoInf{

	/**
	 *获得所有
	 */
	@Override
	public List<CarModel> getAll() {
		// TODO Auto-generated method stub
			List<CarModel> carModels = null;
			try {
				carModels = ComPoolUtil.getQueryRunner().query(
						"select  * from Car_Model",
						new BeanListHandler<CarModel>(CarModel.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return carModels;
		}
	/**
	 * 增加
	 */
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 修改
	 */
	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 删除
	 */
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
		List<CarModel> carModels = null;
		try {
			carModels = ComPoolUtil.getQueryRunner().query(
					"select  * from Car_Model where Car_ModelName like '%"+info+"%'",
					new BeanListHandler<CarModel>(CarModel.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carModels;
	}
	
}
