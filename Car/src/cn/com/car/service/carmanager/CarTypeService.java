package cn.com.car.service.carmanager;

import java.util.List;

import cn.com.car.bean.CarType;

/**
 * 汽车类型Service接口
 * @author 单苏娜
 *
 */
public interface CarTypeService {
	/**
	 * 获得所有汽车类型
	 * @return List<CarType> 汽车类型List集合
	 */
	public List<CarType> getAll();
	
	/**
	 * 根据汽车类型的ID获得汽车类型信息
	 * @param id 汽车类型ID
	 * @return CarType 一种汽车类型信息
	 */
	public CarType getCarTypeById(Integer id);
	
	/**
	 * 删除汽车类型
	 * @param carType 汽车类型对象
	 * @return int 受影响的行数
	 */
	public int del(CarType carType);
	
	/**
	 * 更新汽车类型
	 * @param carType 汽车类型对象
	 * @return int 受影响的行数
	 */
	public int update(CarType carType);
	
	/**
	 * 添加汽车类型
	 * @param carType 汽车类型对象
	 * @return int 受影响的行数
	 */
	public int add(CarType carType);
}
