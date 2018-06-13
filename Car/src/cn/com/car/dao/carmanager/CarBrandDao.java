package cn.com.car.dao.carmanager;

import java.util.List;

import cn.com.car.bean.CarBrand;

/**
 * 汽车品牌DAO接口
 * @author 单苏娜
 *
 */
public interface CarBrandDao {
	/**
	 * 获得汽车品牌数据的总条数
	 * @return int 汽车品牌数据的总条数
	 */
	public int getCount();
	
	/**
	 * 根据品牌名称获得汽车品牌数据的总条数
	 * @return int 汽车品牌数据的总条数
	 */
	public int getCountByName(String name);
	
	/**
	 * 根据品牌是否被删除获得汽车品牌数据的总条数
	 * @return int 汽车品牌数据的总条数
	 */
	public int getCountByIsDel(Integer isDel);
	
	/**
	 * 获得所有汽车品牌 * 
	 * @param currentPage 当前页码
	 * @param maxResult 每页最多显示的数据条数
	 * @return List<CarBrand> 汽车品牌List集合
	 */
	public List<CarBrand> getAll(Integer currentPage, Integer maxResult);
	
	/**
	 * 根据汽车品牌的ID获得汽车品牌信息
	 * @param id 汽车品牌ID
	 * @return CarBrand 一种汽车品牌信息
	 */
	public CarBrand getCarBrandById(Integer id);
	
	/**
	 * 获得没有被删除的汽车品牌信息
	 * @param isDel 汽车品牌是否被删除
	 * @param currentPage 当前页码
	 * @param maxResult 每页最多显示的数据条数
	 * @return List<CarBrand> 汽车品牌List集合
	 */
	public List<CarBrand> getCarBrandByIsDel(Integer isDel,Integer currentPage, Integer maxResult);
	
	/**
	 * 获得没有被删除的汽车品牌名称
	 * @param isDel 汽车品牌是否被删除
	 * @param currentPage 当前页码
	 * @param maxResult 每页最多显示的数据条数
	 * @return List<CarBrand> 汽车品牌List集合
	 */
	public List<CarBrand> getCarBrandByName(String name,Integer currentPage, Integer maxResult);
	
	/**
	 * 删除汽车品牌
	 * @param carBrand 汽车品牌对象
	 * @return int 受影响的行数
	 */
	public int del(CarBrand carBrand);
	
	/**
	 * 更新汽车品牌
	 * @param carBrand 汽车品牌对象
	 * @return int 受影响的行数
	 */
	public int update(CarBrand carBrand);
	
	/**
	 * 添加汽车品牌
	 * @param carBrand 汽车品牌对象
	 * @return int 受影响的行数
	 */
	public int add(CarBrand carBrand);
}
