package cn.com.car.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import cn.com.car.bean.CarBrand;
import cn.com.car.utils.ComPoolUtil;


public class BaseDao {
	@Test
	public void getAll() {
		List<CarBrand> CarBrands = null;
		try {
			CarBrands = ComPoolUtil.getQueryRunner().query(
					"select  * from car_brand",
					new BeanListHandler<CarBrand>(CarBrand.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(CarBrands.get(0).getCar_Brandname());
	}
}
