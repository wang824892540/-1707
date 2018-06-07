package cn.com.car.bean;


/**
 * 汽车配置实体类
 * @author 小陈老师
 * 
 */

public class CarConfig {
	//汽车型号ID
    private Integer car_Modelid;
    //发动机信息
    private String car_Engine;
    //汽车变速箱类型
    private String car_Gearbox;
    //能源类型
    private String car_Energy;
    //续航
    private Integer car_Life;
    //最大功率
    private Integer car_Maxpower;
    //汽车长宽高
    private String car_Volume;
    //汽车结构
    private String car_Structure;
    //车轮驱动
    private Integer car_Tiredrive;
    //是否有安全气囊
    private Integer car_Issafe;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
	public Integer getCar_Modelid() {
		return car_Modelid;
	}
	public void setCar_Modelid(Integer car_Modelid) {
		this.car_Modelid = car_Modelid;
	}
	public String getCar_Engine() {
		return car_Engine;
	}
	public void setCar_Engine(String car_Engine) {
		this.car_Engine = car_Engine;
	}
	public String getCar_Gearbox() {
		return car_Gearbox;
	}
	public void setCar_Gearbox(String car_Gearbox) {
		this.car_Gearbox = car_Gearbox;
	}
	public String getCar_Energy() {
		return car_Energy;
	}
	public void setCar_Energy(String car_Energy) {
		this.car_Energy = car_Energy;
	}
	public Integer getCar_Life() {
		return car_Life;
	}
	public void setCar_Life(Integer car_Life) {
		this.car_Life = car_Life;
	}
	public Integer getCar_Maxpower() {
		return car_Maxpower;
	}
	public void setCar_Maxpower(Integer car_Maxpower) {
		this.car_Maxpower = car_Maxpower;
	}
	public String getCar_Volume() {
		return car_Volume;
	}
	public void setCar_Volume(String car_Volume) {
		this.car_Volume = car_Volume;
	}
	public String getCar_Structure() {
		return car_Structure;
	}
	public void setCar_Structure(String car_Structure) {
		this.car_Structure = car_Structure;
	}
	public Integer getCar_Tiredrive() {
		return car_Tiredrive;
	}
	public void setCar_Tiredrive(Integer car_Tiredrive) {
		this.car_Tiredrive = car_Tiredrive;
	}
	public Integer getCar_Issafe() {
		return car_Issafe;
	}
	public void setCar_Issafe(Integer car_Issafe) {
		this.car_Issafe = car_Issafe;
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