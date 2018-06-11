package cn.com.car.dao.carconfig;

import java.util.List;

import cn.com.car.bean.CarAllConfig;
import cn.com.car.bean.CarConfig;

/**
 * 汽车详细信息DAO接口
 * @author 小陈老师
 *
 */
public interface CarConfigDao {
	
	/**
	 * 获得所有汽车配置
	 * @return 汽车配置List集合
	 */
	public List<CarConfig> getAll();
	
	/**
	 * 按汽车型号获得汽车详细信息
	 * @param modelId
	 * @return 汽车详细信息实体
	 */
	public CarAllConfig getCarAllInfoByModelId(String modelId);
}
