package cn.com.car.web.rentcar;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import cn.com.car.bean.BuyCarBean;
import cn.com.car.bean.CarModel;
import cn.com.car.bean.RentCarBean;
import cn.com.car.service.buycar.BuyCarServiceInf;
import cn.com.car.service.buycar.impl.BuyCarServiceImpl;
import cn.com.car.service.rentcar.RentCarServiceInf;
import cn.com.car.service.rentcar.impl.RentCarServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * Servlet implementation class CarMallServlet
 */
public class RentCarServlet extends BaseServlet {
	
	/**
	 * 加载所有汽车
	 * 侯晓伟
	 */
	public Object getAll(HttpServletRequest request, HttpServletResponse response){
		RentCarServiceInf cmi = new RentCarServiceImpl();
		List<RentCarBean> listCm = cmi.getAll();
		request.setAttribute("rents", listCm);
		return request.getRequestDispatcher("show/shoppingMall/BuyCar.jsp");
	}
	
	/**
	 * 查询汽车
	 * 侯晓伟
	 */
	public void getCarInfoByInfo(HttpServletRequest request, HttpServletResponse response){
		
		RentCarServiceInf cmi = new RentCarServiceImpl();
		String info = request.getParameter("searchText");
		List<RentCarBean> listCm = cmi.getCarInfoByInfo(info);
		try {
			response.getWriter().print(new Gson().toJson(listCm));
			response.getWriter().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//request.setAttribute("datas", listCm);
		//return request.getRequestDispatcher("show/shoppingMall/BuyCar.jsp");
	}
}
