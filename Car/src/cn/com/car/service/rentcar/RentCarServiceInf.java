package cn.com.car.service.rentcar;

import java.util.List;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.bean.RentCarBean;

/**
 * 汽车商城服务接口
 * @author 侯晓伟
 *
 */
public interface RentCarServiceInf {
	/**
	 * 获得所有
	 */
	public List<RentCarBean> getAll();
	
	/**
	 * 增加
	 */
	public int add();
	
	/**
	 * 修改
	 */
	public int update();
	
	/**
	 * 删除
	 */
	public int del();
	
	/**
	 * 查询
	 */
	public List<RentCarBean> getCarInfoByInfo(String info);
}
