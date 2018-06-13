package cn.com.car.web.carmanager;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.car.bean.CarColor;
import cn.com.car.bean.PageBean;
import cn.com.car.service.carmanager.CarColorService;
import cn.com.car.service.carmanager.impl.CarColorServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * 汽车颜色servlet控制层
 * @author 单苏娜
 *
 */
public class CarColorServlet extends BaseServlet {
	
	private static final long serialVersionUID = 1L;
    CarColorService carColorService = new CarColorServiceImpl();
    
	/**
	 * 显示所有未被删除的餐桌颜色信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//新建一个PageBean对象
		PageBean<CarColor> pageBean = new PageBean<CarColor>();
		//获得当前页码
		String page = request.getParameter("page");
		//获得未被删除的所有汽车颜色
		Integer isDel = 1;
		//查询数据并 分页
		carColorService.setPageBeanByIsDel(isDel, pageBean, page);
		//将获得的pageBean存入作用域，方便页面获取
		request.setAttribute("pageBean", pageBean);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/carcolor_look_detail.jsp");
	}
	
	/**
	 * 通过汽车颜色名称获得所有未被删除的汽车颜色信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listByName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//新建一个PageBean对象
		PageBean<CarColor> pageBean = new PageBean<CarColor>();
		//获得当前页码
		String page = request.getParameter("page");
		//获得用户输入的名称
		String name = request.getParameter("txt-search");
		if("0".equals(name)){
			name = "";
		}else if("".equals(name) || name == null){
			//获得所有未被删除的颜色信息并分页
			carColorService.setPageBeanByIsDel(1, pageBean, page);
		}else{
			//通过颜色名称查询数据并分页
			carColorService.setPageBeanByName(name, pageBean, page);
		}
		//将获得的pageBean存入作用域，方便页面获取
		request.setAttribute("pageBean", pageBean);
		//将名称返回到页面
		request.setAttribute("keyWord", name);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/carcolor_look_detail.jsp");
	}
	
	/**
	 * 添加汽车颜色
	 * @param request
	 * @param response
	 */
	public Object add(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String colorName = request.getParameter("colorName");
		String colorRemark = request.getParameter("colorRemark");
		
		//将数据封装到CarColor对象里
		CarColor carColor = new CarColor();
		carColor.setCar_Colorname(colorName);
		carColor.setCar_Remark(colorRemark);
		
		//添加到数据库
		carColorService.add(carColor);
		//返回列表界面
		return listAll(request, response);
	}
	
	/**
	 * 删除汽车颜色
	 * @param request
	 * @param response
	 * @return
	 */
	public Object del(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String id = request.getParameter("carColorId");
		Integer colorId = Integer.parseInt(id);
		//将数据封装到CarColor对象里
		CarColor carColor = new CarColor();
		carColor.setCar_Colorid(colorId);
		
		//在数据库中修改删除字段值
		carColorService.del(carColor);
		//返回列表界面
		return listAll(request, response);
	}
	
	/**
	 * 更新汽车颜色的信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object update(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		Integer colorId = Integer.parseInt(request.getParameter("carColorId"));
		String colorName = request.getParameter("carColorName");
		String colorRemark = request.getParameter("carColorRemark");
		
		//将数据封装到CarColor对象里
		CarColor carColor = new CarColor();
		carColor.setCar_Colorid(colorId);
		carColor.setCar_Colorname(colorName);
		carColor.setCar_Remark(colorRemark);
		
		//添加到数据库
		carColorService.update(carColor);
		//返回列表界面
		return listAll(request, response);
	}
	
	


}
