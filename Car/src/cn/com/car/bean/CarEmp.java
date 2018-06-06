package cn.com.car.bean;

import java.util.Date;
/**
 * 员工信息实体类
 * @author 小陈老师
 *
 */
public class CarEmp {
	
	//序号(员工id)
    private Integer carEid;
    //用户名
    private String carEusername;
    //密码
    private String carEpassword;
    //姓名
    private String carEname;
    //性别
    private String carEsex;
    //电话
    private String carEtel;
    //邮箱
    private String carEemail;
    //身份证号
    private String carEidcard;
    //入职时间
    private Date carEinwork;
    //工资
    private Integer carEprice;
    //工作状态
    private Integer carEwordstate;
    //是否管理员
    private Integer carEisadmin;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarEid() {
        return carEid;
    }

    public void setCarEid(Integer carEid) {
        this.carEid = carEid;
    }

    public String getCarEusername() {
        return carEusername;
    }

    public void setCarEusername(String carEusername) {
        this.carEusername = carEusername == null ? null : carEusername.trim();
    }

    public String getCarEpassword() {
        return carEpassword;
    }

    public void setCarEpassword(String carEpassword) {
        this.carEpassword = carEpassword == null ? null : carEpassword.trim();
    }

    public String getCarEname() {
        return carEname;
    }

    public void setCarEname(String carEname) {
        this.carEname = carEname == null ? null : carEname.trim();
    }

    public String getCarEsex() {
        return carEsex;
    }

    public void setCarEsex(String carEsex) {
        this.carEsex = carEsex == null ? null : carEsex.trim();
    }

    public String getCarEtel() {
        return carEtel;
    }

    public void setCarEtel(String carEtel) {
        this.carEtel = carEtel == null ? null : carEtel.trim();
    }

    public String getCarEemail() {
        return carEemail;
    }

    public void setCarEemail(String carEemail) {
        this.carEemail = carEemail == null ? null : carEemail.trim();
    }

    public String getCarEidcard() {
        return carEidcard;
    }

    public void setCarEidcard(String carEidcard) {
        this.carEidcard = carEidcard == null ? null : carEidcard.trim();
    }

    public Date getCarEinwork() {
        return carEinwork;
    }

    public void setCarEinwork(Date carEinwork) {
        this.carEinwork = carEinwork;
    }

    public Integer getCarEprice() {
        return carEprice;
    }

    public void setCarEprice(Integer carEprice) {
        this.carEprice = carEprice;
    }

    public Integer getCarEwordstate() {
        return carEwordstate;
    }

    public void setCarEwordstate(Integer carEwordstate) {
        this.carEwordstate = carEwordstate;
    }

    public Integer getCarEisadmin() {
        return carEisadmin;
    }

    public void setCarEisadmin(Integer carEisadmin) {
        this.carEisadmin = carEisadmin;
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