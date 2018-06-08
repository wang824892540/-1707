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
		// TODO Auto-generated method stub
			List<CarModel> carModels = null;
			try {
				carModels = ComPoolUtil.getQueryRunner().query(
						"select  * from Car_Model",
						new BeanListHandler<CarModel>(CarModel.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			for(CarModel cm : carModels){
				System.out.println(cm.getCar_Modelname());
			}
		}
}
