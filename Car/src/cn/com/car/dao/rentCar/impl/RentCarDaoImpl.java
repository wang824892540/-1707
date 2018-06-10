package cn.com.car.dao.rentCar.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.bean.RentCarBean;
import cn.com.car.dao.buycar.BuyCarDaoInf;
import cn.com.car.dao.rentCar.RentCarDaoInf;
import cn.com.car.utils.ComPoolUtil;
	
/**
 * 汽车商城数据操作实现类
 * @author 侯晓伟
 *
 */
public class RentCarDaoImpl implements RentCarDaoInf{

	/**
	 *获得所有
	 */
	@Override
	public List<RentCarBean> getAll() {
		// TODO Auto-generated method stub
			List<RentCarBean> rentCarBeans = null;
			try {
				rentCarBeans = ComPoolUtil.getQueryRunner().query(
						"SELECT car_info.Car_Id,Car_BrandName,Car_TypeName,Car_ModelName,car_price.Car_Rant,car_info.Car_Remark from Car_info LEFT JOIN Car_model on car_info.Car_ModelID = Car_Model.Car_ModelId  LEFT JOIN car_brand on car_model.Car_BrandID = Car_Brand.Car_BrandID LEFT JOIN car_type on car_model.Car_TypeID = car_type.Car_TypeId LEFT JOIN car_price on car_info.Car_ModelID = car_price.Car_ModelId WHERE Car_isNew = 0"
						,
						new BeanListHandler<RentCarBean>(RentCarBean.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return rentCarBeans;
		}
	/**
	 * 增加
	 */
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 修改
	 */
	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 删除
	 */
	@Override
	public int del() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * 通过信息查询汽车型号
	 */
	@Override
	public List<RentCarBean> getCarInfoByInfo(String info) {
		// TODO Auto-generated method stub
		List<RentCarBean> rentCarBeans = null;
		try {
			rentCarBeans = ComPoolUtil.getQueryRunner().query(
					"SELECT car_info.Car_Id,Car_BrandName,Car_TypeName,Car_ModelName,car_price.Car_Rant,car_info.Car_Remark from Car_info LEFT JOIN Car_model on car_info.Car_ModelID = Car_Model.Car_ModelId  LEFT JOIN car_brand on car_model.Car_BrandID = Car_Brand.Car_BrandID LEFT JOIN car_type on car_model.Car_TypeID = car_type.Car_TypeId LEFT JOIN car_price on car_info.Car_ModelID = car_price.Car_ModelId where Car_isNew = 0 and Car_ModelName like '%"+info+"%' or Car_isNew = 0 and Car_TypeName like '%"+info+"%' or Car_isNew = 0 and Car_BrandName like '%"+info+"%'",
					new BeanListHandler<RentCarBean>(RentCarBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rentCarBeans;
	}
	
}
