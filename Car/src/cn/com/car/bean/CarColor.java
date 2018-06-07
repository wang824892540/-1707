package cn.com.car.bean;
/**
 * 汽车颜色实体类
 * @author 小陈老师
 *
 */

public class CarColor {
	
	//颜色ID
    private Integer car_Colorid;
    //颜色名字
    private String car_Colorname;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
    
	public Integer getCar_Colorid() {
		return car_Colorid;
	}
	public void setCar_Colorid(Integer car_Colorid) {
		this.car_Colorid = car_Colorid;
	}
	public String getCar_Colorname() {
		return car_Colorname;
	}
	public void setCar_Colorname(String car_Colorname) {
		this.car_Colorname = car_Colorname;
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