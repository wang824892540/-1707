package cn.com.car.bean;

public class RentCarBean {
	//汽车ID
	private Integer car_Id;
	//品牌名 
	private String car_BrandName;
	//类型名
	private String car_TypeName;
	//型号名
	private String car_ModelName;
	//租车价格
	private Integer car_Rant;
	//备注
	private String car_remark;
	
	public Integer getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}
	public String getCar_BrandName() {
		return car_BrandName;
	}
	public void setCar_BrandName(String car_BrandName) {
		this.car_BrandName = car_BrandName;
	}
	public String getCar_TypeName() {
		return car_TypeName;
	}
	public void setCar_TypeName(String car_TypeName) {
		this.car_TypeName = car_TypeName;
	}
	public Integer getCar_Rant() {
		return car_Rant;
	}
	public void setCar_Rant(Integer car_Rant) {
		this.car_Rant = car_Rant;
	}
	public String getCar_ModelName() {
		return car_ModelName;
	}
	public void setCar_ModelName(String car_ModelName) {
		this.car_ModelName = car_ModelName;
	}
	public String getCar_remark() {
		return car_remark;
	}
	public void setCar_remark(String car_remark) {
		this.car_remark = car_remark;
	}
	
	
	
}
