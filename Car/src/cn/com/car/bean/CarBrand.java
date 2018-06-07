package cn.com.car.bean;


/**
 * 汽车品牌实体类
 * @author 小陈老师
 * 
 */
public class CarBrand {
	//品牌ID
    private Integer car_Brandid;
    //品牌名
    private String car_Brandname;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
    
	public Integer getCar_Brandid() {
		return car_Brandid;
	}
	public void setCar_Brandid(Integer car_Brandid) {
		this.car_Brandid = car_Brandid;
	}
	public String getCar_Brandname() {
		return car_Brandname;
	}
	public void setCar_Brandname(String car_Brandname) {
		this.car_Brandname = car_Brandname;
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