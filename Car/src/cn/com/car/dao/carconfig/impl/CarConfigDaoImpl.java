package cn.com.car.dao.carconfig.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.CarAllConfig;
import cn.com.car.bean.CarColor;
import cn.com.car.bean.CarConfig;
import cn.com.car.dao.carconfig.CarConfigDao;
import cn.com.car.utils.ComPoolUtil;

/**
 * 汽车详细信息DAO实现类
 * @author 小陈老师
 *
 */
public class CarConfigDaoImpl implements CarConfigDao{

	@Override
	public List<CarConfig> getAll() {
		// TODO Auto-generated method stub
		List<CarConfig> carConfigList = null;
		String sql = "select * from car_config";
		try {
			carConfigList = ComPoolUtil.getQueryRunner().query(
					sql, 
					new BeanListHandler<CarConfig>(CarConfig.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carConfigList;
	}

	@Override
	public CarAllConfig getCarAllInfoByModelId(String modelId) {
		// TODO Auto-generated method stub
		CarAllConfig carAllInfo = null;
		String sql = "select car_brand.Car_BrandName,car_model.Car_ModelName,car_type.Car_TypeName,car_price.Car_sell,car_config.Car_Engine,car_config.Car_Gearbox,car_config.Car_Energy,car_config.Car_life,car_config.Car_Maxpower,car_config.Car_Structure,car_config.Car_TireDrive,car_config.Car_Volume,car_config.Car_isSafe from car_model left join car_brand on car_model.Car_BrandID = car_brand.Car_BrandID left join car_type on car_model.Car_TypeID = car_type.Car_TypeId left join car_config on car_model.Car_ModelId = car_config.Car_ModelId left join car_price on car_model.Car_ModelId = car_price.Car_ModelId where car_model.Car_ModelId = ?";
		try {
			carAllInfo = ComPoolUtil.getQueryRunner().query(
					sql,
					new BeanHandler<CarAllConfig>(CarAllConfig.class),modelId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return carAllInfo;
	}
	
}
