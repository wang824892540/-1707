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
	 * 获得所有汽车品牌
	 * @return List<CarBrand> 汽车品牌List集合
	 */
	public List<CarBrand> getAll();
	
	/**
	 * 根据汽车品牌的ID获得汽车品牌信息
	 * @param id 汽车品牌ID
	 * @return CarBrand 一种汽车品牌信息
	 */
	public CarBrand getCarBrandById(Integer id);
	
	/**
	 * 获得没有被删除的汽车品牌信息
	 * @param isDel 汽车品牌是否被删除
	 * @return List<CarBrand> 汽车品牌List集合
	 */
	public List<CarBrand> getCarBrandByIsDel(Integer isDel);
	
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
