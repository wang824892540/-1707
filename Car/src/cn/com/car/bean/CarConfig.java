package cn.com.car.bean;


/**
 * 汽车配置实体类
 * @author 小陈老师
 * 
 */

public class CarConfig {
	//汽车型号ID
    private Integer carModelid;
    //发动机信息
    private String carEngine;
    //汽车变速箱类型
    private String carGearbox;
    //能源类型
    private String carEnergy;
    //续航
    private Integer carLife;
    //最大功率
    private Integer carMaxpower;
    //汽车长宽高
    private String carVolume;
    //汽车结构
    private String carStructure;
    //车轮驱动
    private Integer carTiredrive;
    //是否有安全气囊
    private Integer carIssafe;
    //备注
    private String carRemark;
    //删除状态
    private Integer carIsdel;

    public Integer getCarModelid() {
        return carModelid;
    }

    public void setCarModelid(Integer carModelid) {
        this.carModelid = carModelid;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(String carEngine) {
        this.carEngine = carEngine == null ? null : carEngine.trim();
    }

    public String getCarGearbox() {
        return carGearbox;
    }

    public void setCarGearbox(String carGearbox) {
        this.carGearbox = carGearbox == null ? null : carGearbox.trim();
    }

    public String getCarEnergy() {
        return carEnergy;
    }

    public void setCarEnergy(String carEnergy) {
        this.carEnergy = carEnergy == null ? null : carEnergy.trim();
    }

    public Integer getCarLife() {
        return carLife;
    }

    public void setCarLife(Integer carLife) {
        this.carLife = carLife;
    }

    public Integer getCarMaxpower() {
        return carMaxpower;
    }

    public void setCarMaxpower(Integer carMaxpower) {
        this.carMaxpower = carMaxpower;
    }

    public String getCarVolume() {
        return carVolume;
    }

    public void setCarVolume(String carVolume) {
        this.carVolume = carVolume == null ? null : carVolume.trim();
    }

    public String getCarStructure() {
        return carStructure;
    }

    public void setCarStructure(String carStructure) {
        this.carStructure = carStructure == null ? null : carStructure.trim();
    }

    public Integer getCarTiredrive() {
        return carTiredrive;
    }

    public void setCarTiredrive(Integer carTiredrive) {
        this.carTiredrive = carTiredrive;
    }

    public Integer getCarIssafe() {
        return carIssafe;
    }

    public void setCarIssafe(Integer carIssafe) {
        this.carIssafe = carIssafe;
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