package cn.com.car.web.CarMall;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.car.bean.CarModel;
import cn.com.car.service.carmall.CarMallServiceInf;
import cn.com.car.service.carmall.impl.CarMallServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * Servlet implementation class CarMallServlet
 */
public class CarMallServlet extends BaseServlet {
	
	/**
	 * 加载所有汽车
	 * 侯晓伟
	 */
	public Object getAll(HttpServletRequest request, HttpServletResponse response){
		CarMallServiceInf cmi = new CarMallServiceImpl();
		List<CarModel> listCm = cmi.getAll();
		request.setAttribute("datas", listCm);
		return request.getRequestDispatcher("show/shoppingMall/ShopMall.jsp");
	}
	
	/**
	 * 查询汽车
	 * 侯晓伟
	 */
	public Object getCarModelByInfo(HttpServletRequest request, HttpServletResponse response){
		CarMallServiceInf cmi = new CarMallServiceImpl();
		String info = request.getParameter("searchText");
		System.out.println(info);
		List<CarModel> listCm = cmi.getCarModelByInfo(info);
		request.setAttribute("datas", listCm);
		return request.getRequestDispatcher("show/shoppingMall/ShopMall.jsp");
	}
}
