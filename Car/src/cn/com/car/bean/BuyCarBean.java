package cn.com.car.bean;

public class BuyCarBean {
	//型号ID
	private Integer car_ModelID;
	//品牌名
	private String car_BrandName;
	//类型名
	private String car_TypeName;
	//型号名
	private String car_ModelName;
	//备注
	private String car_remark;
	//删除状态
	private Integer car_isDel;
	
	public Integer getCar_ModelID() {
		return car_ModelID;
	}
	public void setCar_ModelID(Integer car_ModelID) {
		this.car_ModelID = car_ModelID;
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
	public Integer getCar_isDel() {
		return car_isDel;
	}
	public void setCar_isDel(Integer car_isDel) {
		this.car_isDel = car_isDel;
	}
	
	
}
