package cn.com.car.bean;

/**
 * 汽车基本信息实体类
 * @author 小陈老师
 *
 */
public class CarInfo {
	//汽车ID
    private Integer car_Id;
    //型号ID
    private Integer car_Modelid;
    //颜色ID
    private Integer car_ColorId;
    //车牌号
    private String car_Number;
    //是否新旧
    private Integer car_Isnew;
    //车状态
    private Integer car_State;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	public Integer getCar_ColorId() {
		return car_ColorId;
	}
	public void setCar_ColorId(Integer car_ColorId) {
		this.car_ColorId = car_ColorId;
	}
	public Integer getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(Integer car_Id) {
		this.car_Id = car_Id;
	}
	public Integer getCar_Modelid() {
		return car_Modelid;
	}
	public void setCar_Modelid(Integer car_Modelid) {
		this.car_Modelid = car_Modelid;
	}
	public String getCar_Number() {
		return car_Number;
	}
	public void setCar_Number(String car_Number) {
		this.car_Number = car_Number;
	}
	public Integer getCar_Isnew() {
		return car_Isnew;
	}
	public void setCar_Isnew(Integer car_Isnew) {
		this.car_Isnew = car_Isnew;
	}
	public Integer getCar_State() {
		return car_State;
	}
	public void setCar_State(Integer car_State) {
		this.car_State = car_State;
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