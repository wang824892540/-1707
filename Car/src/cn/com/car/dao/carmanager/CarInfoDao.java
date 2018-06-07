package cn.com.car.dao.carmanager;

import java.util.List;

import cn.com.car.bean.CarInfo;

/**
 * 汽车基本信息DAO接口
 * @author 单苏娜
 *
 */
public interface CarInfoDao {
	/**
	 * 获得所有汽车信息
	 * @return List<CarInfo> 汽车信息List集合
	 */
	public List<CarInfo> getAll();
	
	/**
	 * 根据汽车信息的ID获得汽车信息信息
	 * @param id 汽车信息ID
	 * @return CarInfo 一种汽车信息信息
	 */
	public CarInfo getCarInfoById(Integer id);
	
	/**
	 * 删除汽车信息
	 * @param carInfo 汽车信息对象
	 * @return int 受影响的行数
	 */
	public int del(CarInfo carInfo);
	
	/**
	 * 更新汽车信息
	 * @param carInfo 汽车信息对象
	 * @return int 受影响的行数
	 */
	public int update(CarInfo carInfo);
	
	/**
	 * 添加汽车信息
	 * @param carInfo 汽车信息对象
	 * @return int 受影响的行数
	 */
	public int add(CarInfo carInfo);
	
	/**
	 * 获得没有被删除的汽车信息信息
	 * @param isDel 汽车信息是否被删除
	 * @return List<CarInfo> 汽车信息List集合
	 */
	public List<CarInfo> getCarInfoByIsDel(Integer isDel);
}
