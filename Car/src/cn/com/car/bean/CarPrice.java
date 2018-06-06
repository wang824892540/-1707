package cn.com.car.bean;



/**
 * 汽车价格实体类
 * @author 小陈老师
 *
 */
public class CarPrice {
	
	//汽车ID
    private Integer carId;
    //出售价格
    private Integer carSell;
    //出租价格
    private Integer carRant;
    //进货价格
    private Integer carInprise;
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

    public Integer getCarSell() {
        return carSell;
    }

    public void setCarSell(Integer carSell) {
        this.carSell = carSell;
    }

    public Integer getCarRant() {
        return carRant;
    }

    public void setCarRant(Integer carRant) {
        this.carRant = carRant;
    }

    public Integer getCarInprise() {
        return carInprise;
    }

    public void setCarInprise(Integer carInprise) {
        this.carInprise = carInprise;
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