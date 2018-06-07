package cn.com.car.bean;

import java.util.Date;
/**
 * 二手车况实体类
 * @author 小陈老师
 *
 */
public class CarSituation {
	//汽车ID
    private Integer car_Id;
    //外观
    private Integer car_Appearance;
    //内饰
    private Integer car_Interior;
    //里程
    private Integer car_Mileage;
    //车况
    private Integer car_Condition;
    //车源地
    private String car_Source;
    //上牌时间
    private Date car_Lasttime;
    //车主电话
    private String car_Phone;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	public Integer getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}
	public Integer getCar_Appearance() {
		return car_Appearance;
	}
	public void setCar_Appearance(Integer car_Appearance) {
		this.car_Appearance = car_Appearance;
	}
	public Integer getCar_Interior() {
		return car_Interior;
	}
	public void setCar_Interior(Integer car_Interior) {
		this.car_Interior = car_Interior;
	}
	public Integer getCar_Mileage() {
		return car_Mileage;
	}
	public void setCar_Mileage(Integer car_Mileage) {
		this.car_Mileage = car_Mileage;
	}
	public Integer getCar_Condition() {
		return car_Condition;
	}
	public void setCar_Condition(Integer car_Condition) {
		this.car_Condition = car_Condition;
	}
	public String getCar_Source() {
		return car_Source;
	}
	public void setCar_Source(String car_Source) {
		this.car_Source = car_Source;
	}
	public Date getCar_Lasttime() {
		return car_Lasttime;
	}
	public void setCar_Lasttime(Date car_Lasttime) {
		this.car_Lasttime = car_Lasttime;
	}
	public String getCar_Phone() {
		return car_Phone;
	}
	public void setCar_Phone(String car_Phone) {
		this.car_Phone = car_Phone;
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