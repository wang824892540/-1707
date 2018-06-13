package cn.com.car.web.carmanager;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.car.bean.CarModel;
import cn.com.car.bean.PageBean;
import cn.com.car.service.carmanager.CarModelService;
import cn.com.car.service.carmanager.impl.CarModelServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * 汽车型号servlet控制层
 * @author 单苏娜
 *
 */
public class CarModelServlet extends BaseServlet {
	
	private static final long serialVersionUID = 1L;
    CarModelService carModelService = new CarModelServiceImpl();
    
	/**
	 * 显示所有未被删除的餐桌型号信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//新建一个PageBean对象
		PageBean<CarModel> pageBean = new PageBean<CarModel>();
		//获得当前页码
		String page = request.getParameter("page");
		//获得未被删除的所有汽车品牌
		Integer isDel = 1;
		//查询数据并 分页
		carModelService.setPageBeanByIsDel(isDel, pageBean, page);
		//将获得的pageBean存入作用域，方便页面获取
		request.setAttribute("pageBean", pageBean);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/carmodel_look_detail.jsp");
	}
	
	/**
	 * 添加汽车型号
	 * @param request
	 * @param response
	 */
	public Object add(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String modelName = request.getParameter("modelName");
		String modelRemark = request.getParameter("modelRemark");
		
		//将数据封装到CarModel对象里
		CarModel carModel = new CarModel();
		carModel.setCar_Modelname(modelName);
		carModel.setCar_Remark(modelRemark);
		
		//添加到数据库
		carModelService.add(carModel);
		//返回列表界面
		return listAll(request, response);
	}

	public Object del(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String id = request.getParameter("carModelId");
		Integer modelId = Integer.parseInt(id);
		//将数据封装到CarModel对象里
		CarModel carModel = new CarModel();
		carModel.setCar_Modelid(modelId);
		
		//在数据库中修改删除字段值
		carModelService.del(carModel);
		//返回列表界面
		return listAll(request, response);
	}
	
	public Object update(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		Integer modelId = Integer.parseInt(request.getParameter("carModelId"));
		String modelName = request.getParameter("carModelName");
		String modelRemark = request.getParameter("carModelRemark");
		
		//将数据封装到CarModel对象里
		CarModel carModel = new CarModel();
		carModel.setCar_Modelid(modelId);
		carModel.setCar_Modelname(modelName);
		carModel.setCar_Remark(modelRemark);
		
		//添加到数据库
		carModelService.update(carModel);
		//返回列表界面
		return listAll(request, response);
	}
	
	


}
