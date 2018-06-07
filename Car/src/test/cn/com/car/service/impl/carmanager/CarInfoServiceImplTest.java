package test.cn.com.car.service.impl.carmanager;

import java.util.List;

import org.junit.Test;

import cn.com.car.bean.CarInfo;
import cn.com.car.service.carmanager.CarInfoService;
import cn.com.car.service.carmanager.impl.CarInfoServiceImpl;

public class CarInfoServiceImplTest {
private CarInfoService carInfoService = new CarInfoServiceImpl();
	
	@Test
	public void getAll(){
		List<CarInfo> carInfoList = carInfoService.getAll();
		for(CarInfo carInfo : carInfoList){
			System.out.println("汽车信息车牌号:"+carInfo.getCar_Number()
			);
		}
	}
	
	@Test
	public void getCarInfoById(){
		Integer id = 1;
		CarInfo carInfo = carInfoService.getCarInfoById(id);
		System.out.println("汽车信息车牌号:"+carInfo.getCar_Number());
	}
	
	@Test
	public void del(){
		CarInfo carInfo = new CarInfo();
		carInfo.setCar_Id(1);
		int line = carInfoService.del(carInfo);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void update(){
		CarInfo carInfo = new CarInfo();
		carInfo.setCar_Id(3);
		carInfo.setCar_ColorId(2);
		carInfo.setCar_Isnew(1);
		carInfo.setCar_Modelid(1);
		carInfo.setCar_Number("湘C16645");
		carInfo.setCar_Remark("我的最爱");
		carInfo.setCar_State(0);
		int line = carInfoService.update(carInfo);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void add(){
		CarInfo carInfo = new CarInfo();
		carInfo.setCar_ColorId(1);
		carInfo.setCar_Id(3);
		carInfo.setCar_Isnew(1);
		carInfo.setCar_Modelid(1);
		carInfo.setCar_Number("湘C12345");
		carInfo.setCar_Remark("我的最爱");
		carInfo.setCar_State(1);
		int line = carInfoService.add(carInfo);
		System.out.println("受影响的行数："+line);
	}
	
	@Test
	public void getCarInfoByIsDel(){
		Integer isDel = 0;
		List<CarInfo> carInfoList = carInfoService.getCarInfoByIsDel(isDel);
		for(CarInfo carInfo : carInfoList){
			System.out.println("未被删除的汽车信息名称："+ carInfo.getCar_Number());
		}
	}
}
