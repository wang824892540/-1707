package cn.com.car.bean;


/**
 * 汽车进销存实体类
 * @author 小陈老师
 *
 */
public class CarPss {
	//型号ID
    private Integer carModelid;
    //进
    private Integer carIn;
    //销
    private Integer carOut;
    //存
    private Integer carInventory;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarModelid() {
        return carModelid;
    }

    public void setCarModelid(Integer carModelid) {
        this.carModelid = carModelid;
    }

    public Integer getCarIn() {
        return carIn;
    }

    public void setCarIn(Integer carIn) {
        this.carIn = carIn;
    }

    public Integer getCarOut() {
        return carOut;
    }

    public void setCarOut(Integer carOut) {
        this.carOut = carOut;
    }

    public Integer getCarInventory() {
        return carInventory;
    }

    public void setCarInventory(Integer carInventory) {
        this.carInventory = carInventory;
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