package test.cn.com.car.service.impl.carmanager;

import java.util.List;

import org.junit.Test;

import cn.com.car.bean.CarColor;
import cn.com.car.service.carmanager.CarColorService;
import cn.com.car.service.carmanager.impl.CarColorServiceImpl;

public class CarColorServiceImplTest {
private CarColorService carColorService = new CarColorServiceImpl();
	
	@Test
	public void getAll(){
		List<CarColor> carColorList = carColorService.getAll();
		for(CarColor carColor : carColorList){
			System.out.println("汽车颜色名称:"+carColor.getCar_Colorname());
		}
	}
	
	@Test
	public void getCarColorById(){
		Integer id = 1;
		CarColor carColor = carColorService.getCarColorById(id);
		System.out.println("汽车颜色名称"+carColor.getCar_Colorname());
	}
	
	@Test
	public void del(){
		CarColor carColor = new CarColor();
		carColor.setCar_Colorid(2);;
		int line = carColorService.del(carColor);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void update(){
		CarColor carColor = new CarColor();
		carColor.setCar_Colorid(1);
		carColor.setCar_Colorname("白色");
		carColor.setCar_Remark("优雅大方");
		int line = carColorService.update(carColor);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void add(){
		CarColor carColor = new CarColor();
		carColor.setCar_Colorid(3);
		carColor.setCar_Colorname("红色");
		carColor.setCar_Remark("热烈");
		int line = carColorService.add(carColor);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void getCarColorByIsDel(){
		Integer isDel = 0;
		List<CarColor> carColorList = carColorService.getCarColorByIsDel(isDel);
		for(CarColor carColor : carColorList){
			System.out.println("未被删除的汽车颜色名称："+ carColor.getCar_Colorname());
		}
	}
}
