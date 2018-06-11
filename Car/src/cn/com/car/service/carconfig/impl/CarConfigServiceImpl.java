package cn.com.car.service.carconfig.impl;

import java.util.List;

import cn.com.car.bean.CarAllConfig;
import cn.com.car.bean.CarConfig;
import cn.com.car.dao.carconfig.CarConfigDao;
import cn.com.car.dao.carconfig.impl.CarConfigDaoImpl;
import cn.com.car.service.carconfig.CarConfigService;

/**
 * 汽车详细信息service实现类
 * @author 小陈老师
 *
 */
public class CarConfigServiceImpl implements CarConfigService{
	private CarConfigDao dao = new CarConfigDaoImpl();
	@Override
	public List<CarConfig> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}
	@Override
	public CarAllConfig getCarAllInfoByModelId(String modelId) {
		// TODO Auto-generated method stub
		return dao.getCarAllInfoByModelId(modelId);
	}

}
