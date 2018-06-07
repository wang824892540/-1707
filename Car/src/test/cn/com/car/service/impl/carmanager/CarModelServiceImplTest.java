package test.cn.com.car.service.impl.carmanager;

import java.util.List;

import org.junit.Test;

import cn.com.car.bean.CarModel;
import cn.com.car.service.carmanager.CarModelService;
import cn.com.car.service.carmanager.impl.CarModelServiceImpl;

/**
 * 汽车型号单元测试
 * @author 单苏娜
 *
 */
public class CarModelServiceImplTest {
	
	private CarModelService carModelService = new CarModelServiceImpl();
	
	@Test
	public void getAll(){
		List<CarModel> carModelList = carModelService.getAll();
		for(CarModel carModel : carModelList){
			System.out.println("汽车型号名称:"+carModel.getCar_Modelname());
		}
	}
	
	@Test
	public void getCarModelById(){
		Integer id = 1;
		CarModel carModel = carModelService.getCarModelById(id);
		System.out.println("汽车信息车牌号:"+carModel.getCar_Modelname());
	}
	
	@Test
	public void del(){
		CarModel carModel = new CarModel();
		carModel.setCar_Modelid(1);
		int line = carModelService.del(carModel);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void update(){
		CarModel carModel = new CarModel();
		carModel.setCar_Modelid(2);
		carModel.setCar_Brandid(3);
		carModel.setCar_Modelname("A3");
		carModel.setCar_Remark("有内涵");
		carModel.setCar_Typeid(1);
		int line = carModelService.update(carModel);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void add(){
		CarModel carModel = new CarModel();
		carModel.setCar_Modelid(2);
		carModel.setCar_Brandid(3);
		carModel.setCar_Modelname("A3");
		carModel.setCar_Remark("热情");
		carModel.setCar_Typeid(1);
		int line = carModelService.add(carModel);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void getCarModelByIsDel(){
		Integer isDel = 0;
		List<CarModel> carModelList = carModelService.getCarModelByIsDel(isDel);
		for(CarModel carModel : carModelList){
			System.out.println("未被删除的汽车信息名称："+ carModel.getCar_Modelname());
		}
	}
}
