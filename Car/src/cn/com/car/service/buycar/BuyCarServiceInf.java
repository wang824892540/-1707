package cn.com.car.service.buycar;

import java.util.List;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;

/**
 * 汽车商城服务接口
 * @author 侯晓伟
 *
 */
public interface BuyCarServiceInf {
	/**
	 * 获得所有
	 */
	public List<BuyCarBean> getAll();
	
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
	public List<BuyCarBean> getCarModelByInfo(String info);
}
