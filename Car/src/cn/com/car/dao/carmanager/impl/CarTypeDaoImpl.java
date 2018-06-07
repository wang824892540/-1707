package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.CarType;
import cn.com.car.dao.carmanager.CarTypeDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车类型Dao实现类
 * @author 单苏娜
 *
 */
public class CarTypeDaoImpl implements CarTypeDao{

	@Override
	public List<CarType> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarType getCarTypeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int del(CarType carType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CarType carType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(CarType carType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CarType> getCarTypeByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		List<CarType> carTypeList = null;
		String sql = "select * from car_type where Car_isDel = ?";
		try {
			carTypeList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarType>(CarType.class),
					isDel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carTypeList;
	}

}
