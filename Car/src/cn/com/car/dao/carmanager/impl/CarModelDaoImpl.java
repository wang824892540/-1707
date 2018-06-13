package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.com.car.bean.CarModel;
import cn.com.car.dao.carmanager.CarModelDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车型号Dao实现类
 * @author 单苏娜
 *
 */
public class CarModelDaoImpl implements CarModelDao{

	@Override
	public List<CarModel> getAll(Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		List<CarModel> carModelList = null;
		String sql = "select * from car_Model limit ?,?";
		try {
			carModelList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarModel>(CarModel.class),
					new Object[]{(currentPage-1)*maxResult,maxResult});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carModelList;
	}

	@Override
	public CarModel getCarModelById(Integer id) {
		// TODO Auto-generated method stub
		CarModel carModel = null;
		String sql = "select * from car_Model where Car_ModelID = ?";
		try {
			carModel = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanHandler<CarModel>(CarModel.class),
					id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carModel;
	}

	@Override
	public int del(CarModel carModel) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_Model set Car_isDel = 0 where Car_ModelID = ?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carModel.getCar_Modelid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int update(CarModel carModel) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_Model set Car_ModelName=?,Car_BrandID =?,Car_TypeID=?,Car_Remark=?  where Car_ModelID =?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carModel.getCar_Modelname(),carModel.getCar_Brandid(),carModel.getCar_Typeid(),carModel.getCar_Remark(),carModel.getCar_Modelid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int add(CarModel carModel) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql ="insert into car_Model (Car_ModelName,Car_BrandID,Car_TypeID,Car_Remark,Car_isDel) values(?,?,?,?,1)";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carModel.getCar_Modelname(),carModel.getCar_Brandid(),carModel.getCar_Typeid(),carModel.getCar_Remark());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public List<CarModel> getCarModelByIsDel(Integer isDel,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		List<CarModel> carModelList = null;
		String sql = "select * from car_model where Car_isDel = ? limit ?,?";
		try {
			carModelList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarModel>(CarModel.class),
					isDel,(currentPage-1)*maxResult,maxResult);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carModelList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		Long line = 0L;
		String sql = "select count(*) from car_model ";
		try {
			line = ComPoolUtil.getQueryRunner().query(
					sql, 
					new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line.intValue();
	}

	@Override
	public int getCountByName(String name) {
		// TODO Auto-generated method stub
		Long line = 0L;
		String sql = "select count(*) from car_model where Car_BrandName like '%"+name+"%' and Car_isDel = 1";
		try {
			line = ComPoolUtil.getQueryRunner().query(
					sql, 
					new ScalarHandler<Long>());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line.intValue();
	}

	@Override
	public int getCountByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		Long line = 0L;
		String sql = "select count(*) from car_model where Car_isDel = ?";
		try {
			line = ComPoolUtil.getQueryRunner().query(
					sql, 
					new ScalarHandler<Long>(),
					isDel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line.intValue();
	}

}
