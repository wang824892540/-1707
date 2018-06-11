package cn.com.car.bean;

import java.util.Date;
/**
 * 员工信息实体类
 * @author 小陈老师
 *
 */
public class CarEmp {
	
	//序号(员工id)
    private Integer car_Eid;
    //用户名
    private String car_Eusername;
    //密码
    private String car_Epassword;
    //姓名
    private String car_Ename;
    //性别
    private String car_Esex;
    //电话
    private String car_Etel;
    //邮箱
    private String car_Eemail;
    //身份证号
    private String car_Eidcard;
    //入职时间
    private Date car_Einwork;
    //工资
    private Integer car_Eprice;
    //工作状态
    private Integer car_Ewordstate;
    //是否管理员
    private Integer car_Eisadmin;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    //图片路径
    private String car_Image;
    
    
    
	public String getCar_Image() {
		return car_Image;
	}
	public void setCar_Image(String car_Image) {
		this.car_Image = car_Image;
	}
	public Integer getCar_Eid() {
		return car_Eid;
	}
	public void setCar_Eid(Integer car_Eid) {
		this.car_Eid = car_Eid;
	}
	public String getCar_Eusername() {
		return car_Eusername;
	}
	public void setCar_Eusername(String car_Eusername) {
		this.car_Eusername = car_Eusername;
	}
	public String getCar_Epassword() {
		return car_Epassword;
	}
	public void setCar_Epassword(String car_Epassword) {
		this.car_Epassword = car_Epassword;
	}
	public String getCar_Ename() {
		return car_Ename;
	}
	public void setCar_Ename(String car_Ename) {
		this.car_Ename = car_Ename;
	}
	public String getCar_Esex() {
		return car_Esex;
	}
	public void setCar_Esex(String car_Esex) {
		this.car_Esex = car_Esex;
	}
	public String getCar_Etel() {
		return car_Etel;
	}
	public void setCar_Etel(String car_Etel) {
		this.car_Etel = car_Etel;
	}
	public String getCar_Eemail() {
		return car_Eemail;
	}
	public void setCar_Eemail(String car_Eemail) {
		this.car_Eemail = car_Eemail;
	}
	public String getCar_Eidcard() {
		return car_Eidcard;
	}
	public void setCar_Eidcard(String car_Eidcard) {
		this.car_Eidcard = car_Eidcard;
	}
	public Date getCar_Einwork() {
		return car_Einwork;
	}
	public void setCar_Einwork(Date car_Einwork) {
		this.car_Einwork = car_Einwork;
	}
	public Integer getCar_Eprice() {
		return car_Eprice;
	}
	public void setCar_Eprice(Integer car_Eprice) {
		this.car_Eprice = car_Eprice;
	}
	public Integer getCar_Ewordstate() {
		return car_Ewordstate;
	}
	public void setCar_Ewordstate(Integer car_Ewordstate) {
		this.car_Ewordstate = car_Ewordstate;
	}
	public Integer getCar_Eisadmin() {
		return car_Eisadmin;
	}
	public void setCar_Eisadmin(Integer car_Eisadmin) {
		this.car_Eisadmin = car_Eisadmin;
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