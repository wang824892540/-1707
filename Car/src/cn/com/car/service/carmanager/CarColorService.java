package cn.com.car.service.carmanager;

import java.util.List;

import cn.com.car.bean.CarColor;

/**
 * 汽车颜色Service接口
 * @author 单苏娜
 *
 */
public interface CarColorService {
	/**
	 * 获得所有汽车颜色
	 * @return List<CarColor> 汽车颜色List集合
	 */
	public List<CarColor> getAll();
	
	/**
	 * 根据汽车颜色的ID获得汽车颜色信息
	 * @param id 汽车颜色ID
	 * @return CarColor 一种汽车颜色信息
	 */
	public CarColor getCarColorById(Integer id);
	
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
	public List<CarColor> getCarColorByIsDel(Integer isDel);
}
