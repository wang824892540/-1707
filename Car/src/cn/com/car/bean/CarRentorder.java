package cn.com.car.bean;

import java.util.Date;


/**
 * 租车订单详情实体类
 * @author 小陈老师
 *
 */
public class CarRentorder {
	//订单ID
    private Integer carOid;
    //租车时间
    private Date carRstart;
    //预计还车时间
    private Date carRifend;
    //实际还车时间
    private Date carRend;
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

    public Date getCarRstart() {
        return carRstart;
    }

    public void setCarRstart(Date carRstart) {
        this.carRstart = carRstart;
    }

    public Date getCarRifend() {
        return carRifend;
    }

    public void setCarRifend(Date carRifend) {
        this.carRifend = carRifend;
    }

    public Date getCarRend() {
        return carRend;
    }

    public void setCarRend(Date carRend) {
        this.carRend = carRend;
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