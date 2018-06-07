package cn.com.car.bean;

import java.util.Date;


/**
 * 租车订单详情实体类
 * @author 小陈老师
 *
 */
public class CarRentorder {
	//订单ID
    private Integer car_Oid;
    //租车时间
    private Date car_Rstart;
    //预计还车时间
    private Date car_Rifend;
    //实际还车时间
    private Date car_Rend;
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
	public Date getCar_Rstart() {
		return car_Rstart;
	}
	public void setCar_Rstart(Date car_Rstart) {
		this.car_Rstart = car_Rstart;
	}
	public Date getCar_Rifend() {
		return car_Rifend;
	}
	public void setCar_Rifend(Date car_Rifend) {
		this.car_Rifend = car_Rifend;
	}
	public Date getCar_Rend() {
		return car_Rend;
	}
	public void setCar_Rend(Date car_Rend) {
		this.car_Rend = car_Rend;
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