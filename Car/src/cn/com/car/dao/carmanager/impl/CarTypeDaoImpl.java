package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
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
		List<CarType> carTypeList = null;
		String sql = "select * from car_Type";
		try {
			carTypeList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarType>(CarType.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carTypeList;
	}

	@Override
	public CarType getCarTypeById(Integer id) {
		// TODO Auto-generated method stub
		CarType carType = null;
		String sql = "select * from car_Type where Car_TypeID = ?";
		try {
			carType = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanHandler<CarType>(CarType.class),
					id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carType;
	}

	@Override
	public int del(CarType carType) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_Type set Car_isDel = 0 where Car_TypeID = ?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carType.getCar_Typeid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int update(CarType carType) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_Type set Car_TypeName=?,Car_Remark=?  where Car_TypeID =?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carType.getCar_Typename(),carType.getCar_Remark(),carType.getCar_Typeid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int add(CarType carType) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql ="insert into car_Type (Car_TypeName,Car_Remark,Car_isDel) values(?,?,1)";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carType.getCar_Typename(),carType.getCar_Remark());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
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

	@Override
	public List<CarType> getCarTypeByName(String name) {
		// TODO Auto-generated method stub
		List<CarType> carTypeList = null;
		String sql = "select * from car_type where Car_TypeName like '%"+name+"%' and Car_isDel = 1";
		try {
			carTypeList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarType>(CarType.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carTypeList;
	}

}
