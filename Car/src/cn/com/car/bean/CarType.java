package cn.com.car.bean;

/**
 * 汽车类型实体类
 * @author 小陈老师
 *
 */
public class CarType {
	//类型ID
    private Integer car_Typeid;
    //类型名
    private String car_Typename;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	public Integer getCar_Typeid() {
		return car_Typeid;
	}
	public void setCar_Typeid(Integer car_Typeid) {
		this.car_Typeid = car_Typeid;
	}
	public String getCar_Typename() {
		return car_Typename;
	}
	public void setCar_Typename(String car_Typename) {
		this.car_Typename = car_Typename;
	}
	public String getCar_Remark() {
		return car_Remark;
	}
	public void setCar_Remark(String car_Remark) {
		this.car_Remark = car_Remark;
	}
	public Integer getCar_Isdel() {
		return car_Isdel;
	}
	public void setCar_Isdel(Integer car_Isdel) {
		this.car_Isdel = car_Isdel;
	}
}