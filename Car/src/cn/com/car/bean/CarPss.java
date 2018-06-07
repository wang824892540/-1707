package cn.com.car.bean;


/**
 * 汽车进销存实体类
 * @author 小陈老师
 *
 */
public class CarPss {
	//型号ID
    private Integer car_Modelid;
    //进
    private Integer car_In;
    //销
    private Integer car_Out;
    //存
    private Integer car_Inventory;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	public Integer getCar_Modelid() {
		return car_Modelid;
	}
	public void setCar_Modelid(Integer car_Modelid) {
		this.car_Modelid = car_Modelid;
	}
	public Integer getCar_In() {
		return car_In;
	}
	public void setCar_In(Integer car_In) {
		this.car_In = car_In;
	}
	public Integer getCar_Out() {
		return car_Out;
	}
	public void setCar_Out(Integer car_Out) {
		this.car_Out = car_Out;
	}
	public Integer getCar_Inventory() {
		return car_Inventory;
	}
	public void setCar_Inventory(Integer car_Inventory) {
		this.car_Inventory = car_Inventory;
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