package cn.com.car.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import cn.com.car.bean.CarBrand;
import cn.com.car.bean.CarModel;
import cn.com.car.utils.ComPoolUtil;


public class BaseDao {
	@Test
	public void getAll() {
		List<CarModel> CarBrands = null;
		try {
			CarBrands = ComPoolUtil.getQueryRunner().query(
					"select  * from Car_model",
					new BeanListHandler<CarModel>(CarModel.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(CarModel car : CarBrands){
			System.out.println(car.getCar_Modelname());
		}
	}
}
