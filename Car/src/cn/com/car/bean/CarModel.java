package cn.com.car.bean;

/**
 * 汽车型号实体类
 * @author 小陈老师
 *
 */
public class CarModel {
	//型号ID
    private Integer carModelid;
    //型号名
    private String carModelname;
    //品牌ID
    private Integer carBrandid;
    //类型ID
    private Integer carTypeid;
    //备注
    private String carRemark;
    //备注
    private Integer carIsdel;

    public Integer getCarModelid() {
        return carModelid;
    }

    public void setCarModelid(Integer carModelid) {
        this.carModelid = carModelid;
    }

    public String getCarModelname() {
        return carModelname;
    }

    public void setCarModelname(String carModelname) {
        this.carModelname = carModelname == null ? null : carModelname.trim();
    }

    public Integer getCarBrandid() {
        return carBrandid;
    }

    public void setCarBrandid(Integer carBrandid) {
        this.carBrandid = carBrandid;
    }

    public Integer getCarTypeid() {
        return carTypeid;
    }

    public void setCarTypeid(Integer carTypeid) {
        this.carTypeid = carTypeid;
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