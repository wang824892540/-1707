package cn.com.car.bean;

/**
 * 用户信息实体类
 * @author 小陈老师
 *
 */
public class CarUser {
	//序号
    private Integer carUid;
    //用户名
    private String carUusername;
    //用户密码
    private String carUpassword;
    //姓名
    private String carUname;
    //性别
    private String carUsex;
    //手机号码
    private String carUphone;
    //邮箱
    private String carUemail;
    //身份证
    private String carUidcard;
    //会员积分
    private Integer carUgrade;
    //押金
    private Integer carUprice;
    //信誉积分
    private Integer carUcredit;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarUid() {
        return carUid;
    }

    public void setCarUid(Integer carUid) {
        this.carUid = carUid;
    }

    public String getCarUusername() {
        return carUusername;
    }

    public void setCarUusername(String carUusername) {
        this.carUusername = carUusername == null ? null : carUusername.trim();
    }

    public String getCarUpassword() {
        return carUpassword;
    }

    public void setCarUpassword(String carUpassword) {
        this.carUpassword = carUpassword == null ? null : carUpassword.trim();
    }

    public String getCarUname() {
        return carUname;
    }

    public void setCarUname(String carUname) {
        this.carUname = carUname == null ? null : carUname.trim();
    }

    public String getCarUsex() {
        return carUsex;
    }

    public void setCarUsex(String carUsex) {
        this.carUsex = carUsex == null ? null : carUsex.trim();
    }

    public String getCarUphone() {
        return carUphone;
    }

    public void setCarUphone(String carUphone) {
        this.carUphone = carUphone == null ? null : carUphone.trim();
    }

    public String getCarUemail() {
        return carUemail;
    }

    public void setCarUemail(String carUemail) {
        this.carUemail = carUemail == null ? null : carUemail.trim();
    }

    public String getCarUidcard() {
        return carUidcard;
    }

    public void setCarUidcard(String carUidcard) {
        this.carUidcard = carUidcard == null ? null : carUidcard.trim();
    }

    public Integer getCarUgrade() {
        return carUgrade;
    }

    public void setCarUgrade(Integer carUgrade) {
        this.carUgrade = carUgrade;
    }

    public Integer getCarUprice() {
        return carUprice;
    }

    public void setCarUprice(Integer carUprice) {
        this.carUprice = carUprice;
    }

    public Integer getCarUcredit() {
        return carUcredit;
    }

    public void setCarUcredit(Integer carUcredit) {
        this.carUcredit = carUcredit;
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