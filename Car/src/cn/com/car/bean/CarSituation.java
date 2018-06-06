package cn.com.car.bean;

import java.util.Date;
/**
 * 二手车况实体类
 * @author 小陈老师
 *
 */
public class CarSituation {
	//汽车ID
    private Integer carId;
    //外观
    private Integer carAppearance;
    //内饰
    private Integer carInterior;
    //里程
    private Integer carMileage;
    //车况
    private Integer carCondition;
    //车源地
    private String carSource;
    //上牌时间
    private Date carLasttime;
    //车主电话
    private String carPhone;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarAppearance() {
        return carAppearance;
    }

    public void setCarAppearance(Integer carAppearance) {
        this.carAppearance = carAppearance;
    }

    public Integer getCarInterior() {
        return carInterior;
    }

    public void setCarInterior(Integer carInterior) {
        this.carInterior = carInterior;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }

    public Integer getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(Integer carCondition) {
        this.carCondition = carCondition;
    }

    public String getCarSource() {
        return carSource;
    }

    public void setCarSource(String carSource) {
        this.carSource = carSource == null ? null : carSource.trim();
    }

    public Date getCarLasttime() {
        return carLasttime;
    }

    public void setCarLasttime(Date carLasttime) {
        this.carLasttime = carLasttime;
    }

    public String getCarPhone() {
        return carPhone;
    }

    public void setCarPhone(String carPhone) {
        this.carPhone = carPhone == null ? null : carPhone.trim();
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