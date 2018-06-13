package cn.com.car.web.carmanager;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import cn.com.car.bean.CarBrand;
import cn.com.car.bean.PageBean;
import cn.com.car.service.carmanager.CarBrandService;
import cn.com.car.service.carmanager.impl.CarBrandServiceImpl;
import cn.com.car.web.BaseServlet;

/**
 * 汽车品牌servlet控制层
 * @author 单苏娜
 *
 */
public class CarBrandServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	CarBrandService carBrandService = new CarBrandServiceImpl();
    
	/**
	 * 显示所有未被删除的餐桌品牌信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//新建一个PageBean对象
		PageBean<CarBrand> pageBean = new PageBean<CarBrand>();
		//获得当前页码
		String page = request.getParameter("page");
		//获得未被删除的所有汽车品牌
		Integer isDel = 1;
		//查询数据并 分页
		carBrandService.setPageBeanByIsDel(isDel, pageBean, page);
		//将获得的pageBean存入作用域，方便页面获取
		request.setAttribute("pageBean", pageBean);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/carbrand_look_detail.jsp");
	}
	
	/**
	 * 通过汽车品牌名称获得所有未被删除的汽车品牌信息
	 * @param request
	 * @param response
	 * @return
	 */
	public Object listByName(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//新建一个PageBean对象
		PageBean<CarBrand> pageBean = new PageBean<CarBrand>();
		//获得当前页码
		String page = request.getParameter("page");
		//获得用户输入的名称
		String name = request.getParameter("txt-search");
		if("0".equals(name)){
			name = "";
		}else if("".equals(name) || name == null){
			//获得所有未被删除的品牌信息并分页
			carBrandService.setPageBeanByIsDel(1, pageBean, page);
		}else{
			//通过品牌名称查询数据并分页
			carBrandService.setPageBeanByName(name, pageBean, page);
		}
		//将获得的pageBean存入作用域，方便页面获取
		request.setAttribute("pageBean", pageBean);
		//将名称返回到页面
		request.setAttribute("keyWord", name);
		//跳转到页面
		return request.getRequestDispatcher("/manage/carmanager/carbrand_look_detail.jsp");
	}
	
	/**
	 * 添加汽车品牌
	 * @param request
	 * @param response
	 */
	public Object add(HttpServletRequest request, HttpServletResponse response){
		//上传图片
		upImages(request, response);
		//获得表单数据
		String brandName = request.getParameter("BrandName");
		String brandRemark = request.getParameter("BrandRemark");
		
		//将数据封装到CarBrand对象里
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandname(brandName);
		carBrand.setCar_Remark(brandRemark);
		
		//添加到数据库
		carBrandService.add(carBrand);
		//返回列表界面
		return listAll(request, response);
	}
	
	public Object del(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		String id = request.getParameter("carBrandId");
		Integer brandId = Integer.parseInt(id);
		//将数据封装到CarBrand对象里
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandid(brandId);
		
		//在数据库中修改删除字段值
		carBrandService.del(carBrand);
		//返回列表界面
		return listAll(request, response);
	}
	
	public Object update(HttpServletRequest request, HttpServletResponse response){
		//获得表单数据
		Integer brandId = Integer.parseInt(request.getParameter("carBrandId"));
		String brandName = request.getParameter("carBrandName");
		String brandRemark = request.getParameter("carBrandRemark");
		
		//将数据封装到CarBrand对象里
		CarBrand carBrand = new CarBrand();
		carBrand.setCar_Brandid(brandId);
		carBrand.setCar_Brandname(brandName);
		carBrand.setCar_Remark(brandRemark);
		
		//添加到数据库
		carBrandService.update(carBrand);
		//返回列表界面
		return listAll(request, response);
	}
	
	public void upImages(HttpServletRequest request, HttpServletResponse response){
		//创建上传处理对象
		SmartUpload su = new SmartUpload();
		//设置编码
		su.setCharset("UTF-8");
		
		try {
			//初始化
			su.initialize(this.getServletConfig(), request, response);
			//开始上传
			su.upload();
			//获得图片后缀名
			String suffix = su.getFiles().getFile(0).getFileExt();
			//查库获得品牌编号作为图片名
			String prefix = "1";
			//保存图片
			su.getFiles().getFile(0).saveAs("/CarImages/CarModels"+prefix+"."+suffix);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
