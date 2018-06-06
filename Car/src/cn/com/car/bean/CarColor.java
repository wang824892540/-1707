package cn.com.car.bean;
/**
 * 汽车颜色实体类
 * @author 小陈老师
 *
 */

public class CarColor {
	
	//颜色ID
    private Integer carColorid;
    //颜色名字
    private String carColorname;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarColorid() {
        return carColorid;
    }

    public void setCarColorid(Integer carColorid) {
        this.carColorid = carColorid;
    }

    public String getCarColorname() {
        return carColorname;
    }

    public void setCarColorname(String carColorname) {
        this.carColorname = carColorname == null ? null : carColorname.trim();
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