package cn.com.car.dao.carmanager;

import java.util.List;

import cn.com.car.bean.CarColor;

/**
 * 汽车颜色DAO接口
 * @author 单苏娜
 *
 */
public interface CarColorDao {
	
	/**
	 * 获得汽车颜色数据的总条数
	 * @return int 汽车颜色数据的总条数
	 */
	public int getCount();
	
	/**
	 * 根据颜色名称获得汽车颜色数据的总条数
	 * @return int 汽车颜色数据的总条数
	 */
	public int getCountByName(String name);
	
	/**
	 * 根据颜色是否被删除获得汽车颜色数据的总条数
	 * @return int 汽车颜色数据的总条数
	 */
	public int getCountByIsDel(Integer isDel);
	
	/**
	 * 获得所有汽车颜色
	 * @return List<CarColor> 汽车颜色List集合
	 */
	public List<CarColor> getAll(Integer currentPage, Integer maxResult);
	
	/**
	 * 根据汽车颜色的ID获得汽车颜色信息
	 * @param id 汽车颜色ID
	 * @return CarColor 一种汽车颜色信息
	 */
	public CarColor getCarColorById(Integer id);
	
	/**
	 * 根据汽车颜色的name获得汽车颜色信息
	 * @param name 汽车颜色名称
	 * @return CarColor 一种汽车颜色信息
	 */
	public List<CarColor> getCarColorByName(String name,Integer currentPage, Integer maxResult);
	
	/**
	 * 删除汽车颜色
	 * @param carColor 汽车颜色对象
	 * @return int 受影响的行数
	 */
	public int del(CarColor carColor);
	
	/**
	 * 更新汽车颜色
	 * @param carColor 汽车颜色对象
	 * @return int 受影响的行数
	 */
	public int update(CarColor carColor);
	
	/**
	 * 添加汽车颜色
	 * @param Carcolor 汽车颜色对象
	 * @return int 受影响的行数
	 */
	public int add(CarColor carColor);
	
	/**
	 * 获得没有被删除的汽车颜色信息
	 * @param isDel 汽车颜色是否被删除
	 * @return List<CarColor> 汽车颜色List集合
	 */
	public List<CarColor> getCarColorByIsDel(Integer isDel,Integer currentPage, Integer maxResult);
}
