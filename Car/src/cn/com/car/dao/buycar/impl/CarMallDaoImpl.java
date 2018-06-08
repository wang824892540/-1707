package cn.com.car.dao.buycar.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.dao.buycar.BuyCarDaoInf;
import cn.com.car.utils.ComPoolUtil;
	
/**
 * 汽车商城数据操作实现类
 * @author 侯晓伟
 *
 */
public class CarMallDaoImpl implements BuyCarDaoInf{

	/**
	 *获得所有
	 */
	@Override
	public List<BuyCarBean> getAll() {
		// TODO Auto-generated method stub
			List<BuyCarBean> buyCarBeans = null;
			try {
				buyCarBeans = ComPoolUtil.getQueryRunner().query(
						"select Car_ModelId,Car_BrandName,Car_Typename,car_modelName,car_model.Car_Remark,car_model.Car_isDel from Car_Model left JOIN car_brand on Car_Model.Car_BrandID = car_brand.Car_BrandID left join car_type on car_model.Car_TypeID = car_type.Car_TypeId"
						,
						new BeanListHandler<BuyCarBean>(BuyCarBean.class));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return buyCarBeans;
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
	public List<BuyCarBean> getCarModelByInfo(String info) {
		// TODO Auto-generated method stub
		List<BuyCarBean> buyCarBeans = null;
		try {
			buyCarBeans = ComPoolUtil.getQueryRunner().query(
					"select Car_ModelId,Car_BrandName,Car_Typename,car_modelName,car_model.Car_Remark,car_model.Car_isDel from Car_Model left JOIN car_brand on Car_Model.Car_BrandID = car_brand.Car_BrandID left join car_type on car_model.Car_TypeID = car_type.Car_TypeId where Car_ModelName like '%"+info+"%' or Car_TypeName like '%"+info+"%' or Car_BrandName like '%"+info+"%'",
					new BeanListHandler<BuyCarBean>(BuyCarBean.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return buyCarBeans;
	}
	
}
