package cn.com.car.service.carmanager;

import java.util.List;

import cn.com.car.bean.CarModel;
import cn.com.car.bean.PageBean;

/**
 * 汽车型号Service接口
 * @author 单苏娜
 *
 */
public interface CarModelService {
	
	/**
	 * 获得汽车型号数据的总条数
	 * @return int 汽车型号数据的总条数
	 */
	public int getCount();
	
	/**
	 * 根据型号名称获得汽车型号数据的总条数
	 * @return int 汽车型号数据的总条数
	 */
	public int getCountByName(String name);
	
	/**
	 * 根据型号是否被删除获得汽车型号数据的总条数
	 * @return int 汽车型号数据的总条数
	 */
	public int getCountByIsDel(Integer isDel);
	
	/**
	 * 获得所有汽车型号
	 * @return List<CarModel> 汽车型号List集合
	 */
	public List<CarModel> getAll(Integer currentPage, Integer maxResult);
	
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
	public List<CarModel> getCarModelByIsDel(Integer isDel,Integer currentPage, Integer maxResult);
	
	/**
	 * 分页的业务处理
	 * @param pageBean  分页工具类
	 * @param page  jsp页面传递过来当前页
	 */
	public void setPageBean(PageBean<CarModel> pageBean,String page);
	
	/**
	 * 把通过是否删除获得的数据进行分页的业务处理
	 * @param pageBean  分页工具类
	 * @param page  jsp页面传递过来当前页
	 */
	public void setPageBeanByIsDel(Integer isDel,PageBean<CarModel> pageBean,String page);
}
