package cn.com.car.bean;

/**
 * 汽车基本信息实体类
 * @author 小陈老师
 *
 */
public class CarInfo {
	//汽车ID
    private Integer carId;
    //型号ID
    private Integer carModelid;
    //车牌号
    private String carNumber;
    //是否新旧
    private Integer carIsnew;
    //车状态
    private Integer carState;
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

    public Integer getCarModelid() {
        return carModelid;
    }

    public void setCarModelid(Integer carModelid) {
        this.carModelid = carModelid;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public Integer getCarIsnew() {
        return carIsnew;
    }

    public void setCarIsnew(Integer carIsnew) {
        this.carIsnew = carIsnew;
    }

    public Integer getCarState() {
        return carState;
    }

    public void setCarState(Integer carState) {
        this.carState = carState;
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