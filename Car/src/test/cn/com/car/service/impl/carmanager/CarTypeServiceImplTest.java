package test.cn.com.car.service.impl.carmanager;

import java.util.List;

import org.junit.Test;

import cn.com.car.bean.CarType;
import cn.com.car.service.carmanager.CarTypeService;
import cn.com.car.service.carmanager.impl.CarTypeServiceImpl;

/**
 * 汽车类型单元测试
 * @author 单苏娜
 *
 */
public class CarTypeServiceImplTest {

	private CarTypeService carTypeService = new CarTypeServiceImpl();
	
	@Test
	public void getAll(){
		List<CarType> carTypeList = carTypeService.getAll();
		for(CarType carType : carTypeList){
			System.out.println("汽车类型名称:"+carType.getCar_Typename());
		}
	}
	
	@Test
	public void getCarTypeById(){
		Integer id = 1;
		CarType carType = carTypeService.getCarTypeById(id);
		System.out.println("汽车类型名称:"+carType.getCar_Typename());
	}
	
	@Test
	public void del(){
		CarType carType = new CarType();
		carType.setCar_Typeid(1);
		int line = carTypeService.del(carType);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void update(){
		CarType carType = new CarType();
		carType.setCar_Typeid(3);
		carType.setCar_Typename("吉普车");
		carType.setCar_Remark("狂野豪迈");
		int line = carTypeService.update(carType);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void add(){
		CarType carType = new CarType();
		carType.setCar_Typeid(3);
		carType.setCar_Typename("吉普车");
		carType.setCar_Remark("狂野");
		int line = carTypeService.add(carType);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void getCarTypeByIsDel(){
		Integer isDel = 0;
		List<CarType> carTypeList = carTypeService.getCarTypeByIsDel(isDel);
		for(CarType carType : carTypeList){
			System.out.println("未被删除的汽车信息名称："+ carType.getCar_Typename());
		}
	}
}
