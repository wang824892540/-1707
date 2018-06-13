package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.CarInfo;
import cn.com.car.dao.carmanager.CarInfoDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车基本信息Dao实现类
 * @author 单苏娜
 *
 */
public class CarInfoDaoImpl implements CarInfoDao{

	@Override
	public List<CarInfo> getAll() {
			// TODO Auto-generated method stub
			List<CarInfo> carInfoList = null;
			String sql = "select * from car_info";
			try {
				carInfoList = ComPoolUtil.getQueryRunner().query(
						sql, 
						new BeanListHandler<CarInfo>(CarInfo.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return carInfoList;
	}

	@Override
	public CarInfo getCarInfoById(Integer id) {
		// TODO Auto-generated method stub
		CarInfo carInfo = null;
		String sql = "select * from car_info where Car_Id = ?";
		try {
			carInfo = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanHandler<CarInfo>(CarInfo.class),
					id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carInfo;
	}

	@Override
	public int del(CarInfo carInfo) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_info set Car_isDel = 0 where Car_Id = ?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carInfo.getCar_Id());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int update(CarInfo carInfo) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_info set Car_ColorId= ?,Car_ModelID=?,Car_Number=?,Car_isNew=? ,Car_state=?,Car_Remark=?  where Car_Id =?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carInfo.getCar_ColorId(),carInfo.getCar_Modelid(),carInfo.getCar_Number(),carInfo.getCar_Isnew(),carInfo.getCar_State(),carInfo.getCar_Remark(),carInfo.getCar_Id());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int add(CarInfo carInfo) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql ="insert into car_info (Car_ColorId,Car_ModelID,Car_Number,Car_isNew,Car_state,Car_Remark,Car_isDel) values (?,?,?,?,?,?,1)";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carInfo.getCar_ColorId(),carInfo.getCar_Modelid(),carInfo.getCar_Number(),carInfo.getCar_Isnew(),carInfo.getCar_State(),carInfo.getCar_Remark());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public List<CarInfo> getCarInfoByIsDel(Integer isDel) {
		// TODO Auto-generated method stub
		List<CarInfo> carInfoList = null;
		String sql = "select * from car_info where Car_isDel = ?";
		try {
			carInfoList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarInfo>(CarInfo.class),
					isDel);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carInfoList;
	}

}
