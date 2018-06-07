package cn.com.car.service.carmanager;

import java.util.List;

import cn.com.car.bean.CarModel;

/**
 * 汽车型号Service接口
 * @author 单苏娜
 *
 */
public interface CarModelService {
	/**
	 * 获得所有汽车型号
	 * @return List<CarModel> 汽车型号List集合
	 */
	public List<CarModel> getAll();
	
	/**
	 * 根据汽车型号的ID获得汽车型号信息
	 * @param id 汽车型号ID
	 * @return CarModel 一种汽车型号信息
	 */
	public CarModel getCarModelById(Integer id);
	
	/**
	 * 删除汽车型号
	 * @param carModel 汽车型号对象
	 * @return int 受影响的行数
	 */
	public int del(CarModel carModel);
	
	/**
	 * 更新汽车型号
	 * @param carModel 汽车型号对象
	 * @return int 受影响的行数
	 */
	public int update(CarModel carModel);
	
	/**
	 * 添加汽车型号
	 * @param carModel 汽车型号对象
	 * @return int 受影响的行数
	 */
	public int add(CarModel carModel);
	
	/**
	 * 获得没有被删除的汽车型号信息
	 * @param isDel 汽车型号是否被删除
	 * @return List<CarModel> 汽车型号List集合
	 */
	public List<CarModel> getCarModelByIsDel(Integer isDel);
}
