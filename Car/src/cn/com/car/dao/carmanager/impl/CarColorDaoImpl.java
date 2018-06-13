package cn.com.car.dao.carmanager.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.com.car.bean.CarColor;
import cn.com.car.dao.carmanager.CarColorDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车颜色Dao实现类
 * @author 单苏娜
 *
 */
public class CarColorDaoImpl implements CarColorDao{

	@Override
	public List<CarColor> getAll(Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		List<CarColor> carColorList = null;
		String sql = "select * from car_color limit ?,?";
		try {
			carColorList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarColor>(CarColor.class),
					new Object[]{(currentPage-1)*maxResult,maxResult});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carColorList;
	}

	@Override
	public CarColor getCarColorById(Integer id) {
		// TODO Auto-generated method stub
		CarColor carColor = null;
		String sql = "select * from car_color where Car_ColorID = ?";
		try {
			carColor = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanHandler<CarColor>(CarColor.class),
					id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carColor;
	}

	@Override
	public int del(CarColor carColor) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_color set Car_isDel = 0 where Car_ColorID = ?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carColor.getCar_Colorid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int update(CarColor carColor) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql = "update car_color set Car_ColorName=?,Car_Remark=?  where Car_ColorID =?";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carColor.getCar_Colorname(),carColor.getCar_Remark(),carColor.getCar_Colorid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public int add(CarColor carColor) {
		// TODO Auto-generated method stub
		int line = 0;
		String sql ="insert into car_color (car_colorName,Car_Remark,Car_isDel) values(?,?,1)";
		try {
			line = ComPoolUtil.getQueryRunner().update(
					sql, 
					carColor.getCar_Colorname(),carColor.getCar_Remark());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return line;
	}

	@Override
	public List<CarColor> getCarColorByIsDel(Integer isDel,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		List<CarColor> carColorList = null;
		String sql = "select * from car_Color where Car_isDel = ? limit ?,?";
		try {
			carColorList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarColor>(CarColor.class),
					isDel,(currentPage-1)*maxResult,maxResult);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carColorList;
	}

	@Override
	public List<CarColor> getCarColorByName(String name,Integer currentPage, Integer maxResult) {
		// TODO Auto-generated method stub
		List<CarColor> carColorList = null;
		String sql = "select * from car_color where Car_ColorName like '%"+name+"%' and Car_isDel = 1 limit ?,?";
		try {
			carColorList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarColor>(CarColor.class),
					new Object[]{(currentPage-1)*maxResult,maxResult});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carColorList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		Long line = 0L;
		String sql = "select count(*) from car_color ";
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
		String sql = "select count(*) from car_color where Car_ColorName like '%"+name+"%' and Car_isDel = 1";
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
		String sql = "select count(*) from car_color where Car_isDel = ?";
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
