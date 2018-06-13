package cn.com.car.web.carmanager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.car.bean.CarType;
import cn.com.car.service.carmanager.CarTypeService;
import cn.com.car.service.carmanager.impl.CarTypeServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * 汽车类型servlet控制层
 * @author 单苏娜
 *
 */
public class CarTypeServlet extends BaseServlet {
	
	private static final long serialVersionUID = 1L;
    CarTypeService carTypeService = new CarTypeServiceImpl();
    
	/**
	 * 显示所有未被删除的餐桌类型信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//获得未被删除的所有与汽车类型
		Integer isDel = 1;
		//准备一个list集合接收service层的数据
		List<CarType> carTypeList = carTypeService.getCarTypeByIsDel(isDel);
		//将获得的汽车类型集合存入作用域，方便页面获取
		request.setAttribute("carTypeList", carTypeList);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/cartype_look_detail.jsp");
	}
	
	/**
	 * 通过汽车类型名称获得所有未被删除的汽车类型信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listByName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//获得用户输入的名称
		String name = request.getParameter("txt-search");
		//准备一个list集合接收service层的数据
		List<CarType> carTypeList = carTypeService.getCarTypeByName(name);
		//将获得的汽车类型集合存入作用域，方便页面获取
		request.setAttribute("carTypeList", carTypeList);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/cartype_look_detail.jsp");
	}
	
	/**
	 * 添加汽车类型
	 * @param request
	 * @param response
	 */
	public Object add(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String typeName = request.getParameter("typeName");
		System.out.println(typeName);
		String typeRemark = request.getParameter("typeRemark");
		//将数据封装到CarType对象里
		CarType carType = new CarType();
		carType.setCar_Typename(typeName);
		carType.setCar_Remark(typeRemark);
		
		//添加到数据库
		carTypeService.add(carType);
		//返回列表界面
		return listAll(request, response);
	}

	public Object del(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String id = request.getParameter("carTypeId");
		Integer typeId = Integer.parseInt(id);
		//将数据封装到CarType对象里
		CarType carType = new CarType();
		carType.setCar_Typeid(typeId);
		
		//在数据库中修改删除字段值
		carTypeService.del(carType);
		//返回列表界面
		return listAll(request, response);
	}
	
	public Object update(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		Integer typeId = Integer.parseInt(request.getParameter("carTypeId"));
		String typeName = request.getParameter("carTypeName");
		String typeRemark = request.getParameter("carTypeRemark");
		
		//将数据封装到CarType对象里
		CarType carType = new CarType();
		carType.setCar_Typeid(typeId);
		carType.setCar_Typename(typeName);
		carType.setCar_Remark(typeRemark);
		
		//添加到数据库
		carTypeService.update(carType);
		//返回列表界面
		return listAll(request, response);
	}
	
	


}
