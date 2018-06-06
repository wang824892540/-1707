package cn.com.car.bean;

import java.util.Date;

/**
 * 订单实体类
 * @author 小陈老师
 *
 */

public class CarOrder {
	
	//订单ID
    private Integer carOid;
    //用户ID
    private Integer carUid;
    //汽车ID
    private Integer carId;
    //员工ID
    private Integer carEmpid;
    //订单类型
    private Integer carOtype;
    //订单时间
    private Date carOdate;
    //订单金额
    private Integer carOprice;
    //订单状态
    private Integer carOstate;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarOid() {
        return carOid;
    }

    public void setCarOid(Integer carOid) {
        this.carOid = carOid;
    }

    public Integer getCarUid() {
        return carUid;
    }

    public void setCarUid(Integer carUid) {
        this.carUid = carUid;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarEmpid() {
        return carEmpid;
    }

    public void setCarEmpid(Integer carEmpid) {
        this.carEmpid = carEmpid;
    }

    public Integer getCarOtype() {
        return carOtype;
    }

    public void setCarOtype(Integer carOtype) {
        this.carOtype = carOtype;
    }

    public Date getCarOdate() {
        return carOdate;
    }

    public void setCarOdate(Date carOdate) {
        this.carOdate = carOdate;
    }

    public Integer getCarOprice() {
        return carOprice;
    }

    public void setCarOprice(Integer carOprice) {
        this.carOprice = carOprice;
    }

    public Integer getCarOstate() {
        return carOstate;
    }

    public void setCarOstate(Integer carOstate) {
        this.carOstate = carOstate;
    }

    public String getCarRemark() {
        return carRemark;
    }

    public void setCarRemark(String carRemark) {
        this.carRemark = carRemark == null ? null : carRemark.trim();
    }

    public Integer getCarIsdel() {
        return carIsdel;
    }

    public void setCarIsdel(Integer carIsdel) {
        this.carIsdel = carIsdel;
    }
}