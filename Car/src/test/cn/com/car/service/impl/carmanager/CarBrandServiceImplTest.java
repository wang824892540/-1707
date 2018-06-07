package test.cn.com.car.service.impl.carmanager;

import java.util.List;

import org.junit.Test;

import cn.com.car.bean.CarBrand;
import cn.com.car.service.carmanager.CarBrandService;
import cn.com.car.service.carmanager.impl.CarBrandServiceImpl;

/**
 * 汽车品牌单元测试
 * @author 单苏娜
 *
 */
public class CarBrandServiceImplTest {
	private CarBrandService carBrandService = new CarBrandServiceImpl();
	
	@Test
	public void getAll(){
		List<CarBrand> carBrandList = carBrandService.getAll();
		for(CarBrand carBrand : carBrandList){
			System.out.println("汽车品牌名称:"+carBrand.getCar_Brandname());
		}
	}
	
	@Test
	public void getCarBrandById(){
		Integer id = 1;
		CarBrand carBrand = carBrandService.getCarBrandById(id);
		System.out.println("汽车品牌名称"+carBrand.getCar_Brandname());
	}
	
	@Test
	public void del(){
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandid(2);;
		int line = carBrandService.del(carBrand);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void update(){
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandid(8);
		carBrand.setCar_Brandname("凯迪拉克");
		carBrand.setCar_Remark("豪车");
		int line = carBrandService.update(carBrand);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void add(){
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandid(8);
		carBrand.setCar_Brandname("宝马");
		carBrand.setCar_Remark("买不起的车");
		int line = carBrandService.add(carBrand);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void getCarBrandByIsDel(){
		Integer isDel = 0;
		List<CarBrand> carBrandList = carBrandService.getCarBrandByIsDel(isDel);
		for(CarBrand carBrand : carBrandList){
			System.out.println("未被删除的汽车品牌名称："+ carBrand.getCar_Brandname());
		}
	}
	
}
