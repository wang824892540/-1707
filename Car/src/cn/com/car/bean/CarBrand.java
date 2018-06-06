package cn.com.car.bean;


/**
 * 汽车品牌实体类
 * @author 小陈老师
 * 
 */
public class CarBrand {
	//品牌ID
    private Integer carBrandid;
    //品牌名
    private String carBrandname;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    
    public Integer getCarBrandid() {
        return carBrandid;
    }

    public void setCarBrandid(Integer carBrandid) {
        this.carBrandid = carBrandid;
    }

    public String getCarBrandname() {
        return carBrandname;
    }

    public void setCarBrandname(String carBrandname) {
        this.carBrandname = carBrandname == null ? null : carBrandname.trim();
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