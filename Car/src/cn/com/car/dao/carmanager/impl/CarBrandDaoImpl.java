package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.CarBrand;
import cn.com.car.dao.carmanager.CarBrandDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车品牌Dao实现类
 * @author 单苏娜
 *
 */
public class CarBrandDaoImpl implements CarBrandDao{

	@Override
	public List<CarBrand> getAll() {
		// TODO Auto-generated method stub
		List<CarBrand> carBrandList = null;
		String sql = "select * from car_brand";
		try {
			carBrandList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarBrand>(CarBrand.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carBrandList;
	}

	@Override
	public CarBrand getCarBrandById(Integer id) {
		// TODO Auto-generated method stub
		CarBrand carBrand = null;
		String sql = "select * from car_brand where Car_BrandID = ?";
		try {
			carBrand = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanHandler<CarBrand>(CarBrand.class),
					id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carBrand;
	}

	@Override
	public int del(CarBrand carBrand) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_brand set Car_isDel = 0 where Car_BrandID = ?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carBrand.getCar_Brandid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int update(CarBrand carBrand) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_brand set Car_BrandName=?,Car_Remark=?  where Car_BrandID =?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carBrand.getCar_Brandname(),carBrand.getCar_Remark(),carBrand.getCar_Brandid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int add(CarBrand carBrand) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql ="insert into car_brand (Car_BrandID,Car_BrandName,Car_Remark,Car_isDel) values(?,?,?,1)";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carBrand.getCar_Brandid(),carBrand.getCar_Brandname(),carBrand.getCar_Remark());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public List<CarBrand> getCarBrandByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		List<CarBrand> carBrandList = null;
		String sql = "select * from car_brand where Car_isDel = ?";
		try {
			carBrandList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarBrand>(CarBrand.class),
					isDel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carBrandList;
	}

}
