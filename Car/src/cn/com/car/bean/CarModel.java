package cn.com.car.bean;

/**
 * 汽车型号实体类
 * @author 小陈老师
 *
 */
public class CarModel {
	//型号ID
    private Integer car_Modelid;
    //型号名
    private String car_Modelname;
    //品牌ID
    private Integer car_Brandid;
    //类型ID
    private Integer car_Typeid;
    //备注
    private String car_Remark;
    //备注
    private Integer car_Isdel;
    
	public Integer getCar_Modelid() {
		return car_Modelid;
	}
	public void setCar_Modelid(Integer car_Modelid) {
		this.car_Modelid = car_Modelid;
	}
	public String getCar_Modelname() {
		return car_Modelname;
	}
	public void setCar_Modelname(String car_Modelname) {
		this.car_Modelname = car_Modelname;
	}
	public Integer getCar_Brandid() {
		return car_Brandid;
	}
	public void setCar_Brandid(Integer car_Brandid) {
		this.car_Brandid = car_Brandid;
	}
	public Integer getCar_Typeid() {
		return car_Typeid;
	}
	public void setCar_Typeid(Integer car_Typeid) {
		this.car_Typeid = car_Typeid;
	}
	public String getCar_Remark() {
		return car_Remark;
	}
	public void setCar_Remark(String car_Remark) {
		this.car_Remark = car_Remark;
	}
	public Integer getCar_Isdel() {
		return car_Isdel;
	}
	public void setCar_Isdel(Integer car_Isdel) {
		this.car_Isdel = car_Isdel;
	}

    
}