package cn.com.car.bean;

/**
 * 汽车类型实体类
 * @author 小陈老师
 *
 */
public class CarType {
	//类型ID
    private Integer carTypeid;
    //类型名
    private String carTypename;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarTypeid() {
        return carTypeid;
    }

    public void setCarTypeid(Integer carTypeid) {
        this.carTypeid = carTypeid;
    }

    public String getCarTypename() {
        return carTypename;
    }

    public void setCarTypename(String carTypename) {
        this.carTypename = carTypename == null ? null : carTypename.trim();
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