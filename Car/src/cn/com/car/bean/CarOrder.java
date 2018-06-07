package cn.com.car.bean;

import java.util.Date;

/**
 * 订单实体类
 * @author 小陈老师
 *
 */

public class CarOrder {
	
	//订单ID
    private Integer car_Oid;
    //用户ID
    private Integer car_Uid;
    //汽车ID
    private Integer car_Id;
    //员工ID
    private Integer car_Empid;
    //订单类型
    private Integer car_Otype;
    //订单时间
    private Date car_Odate;
    //订单金额
    private Integer car_Oprice;
    //订单状态
    private Integer car_Ostate;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	public Integer getCar_Oid() {
		return car_Oid;
	}
	public void setCar_Oid(Integer car_Oid) {
		this.car_Oid = car_Oid;
	}
	public Integer getCar_Uid() {
		return car_Uid;
	}
	public void setCar_Uid(Integer car_Uid) {
		this.car_Uid = car_Uid;
	}
	public Integer getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}
	public Integer getCar_Empid() {
		return car_Empid;
	}
	public void setCar_Empid(Integer car_Empid) {
		this.car_Empid = car_Empid;
	}
	public Integer getCar_Otype() {
		return car_Otype;
	}
	public void setCar_Otype(Integer car_Otype) {
		this.car_Otype = car_Otype;
	}
	public Date getCar_Odate() {
		return car_Odate;
	}
	public void setCar_Odate(Date car_Odate) {
		this.car_Odate = car_Odate;
	}
	public Integer getCar_Oprice() {
		return car_Oprice;
	}
	public void setCar_Oprice(Integer car_Oprice) {
		this.car_Oprice = car_Oprice;
	}
	public Integer getCar_Ostate() {
		return car_Ostate;
	}
	public void setCar_Ostate(Integer car_Ostate) {
		this.car_Ostate = car_Ostate;
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