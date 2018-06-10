package cn.com.car.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import cn.com.car.bean.CarBrand;
import cn.com.car.bean.CarModel;
import cn.com.car.bean.RentCarBean;
import cn.com.car.utils.ComPoolUtil;


public class BaseDao {
	@Test
	public void getAll() {
		// TODO Auto-generated method stub
		List<RentCarBean> rentCarBeans = null;
		String info = "大众";
		try {
			rentCarBeans = ComPoolUtil.getQueryRunner().query(
					"SELECT car_info.Car_Id,Car_BrandName,Car_TypeName,Car_ModelName,car_price.Car_Rant,car_info.Car_Remark from Car_info LEFT JOIN Car_model on car_info.Car_ModelID = Car_Model.Car_ModelId  LEFT JOIN car_brand on car_model.Car_BrandID = Car_Brand.Car_BrandID LEFT JOIN car_type on car_model.Car_TypeID = car_type.Car_TypeId LEFT JOIN car_price on car_info.Car_ModelID = car_price.Car_ModelId where Car_isNew = 0 and Car_ModelName like '%"+info+"%' or Car_isNew = 0 and Car_TypeName like '%"+info+"%' or Car_isNew = 0 and Car_BrandName like '%"+info+"%'",
					new BeanListHandler<RentCarBean>(RentCarBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(RentCarBean rcb : rentCarBeans){
			System.out.println(rcb.getCar_BrandName());
		}
		}
}
