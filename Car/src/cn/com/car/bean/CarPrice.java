package cn.com.car.bean;



/**
 * 汽车价格实体类
 * @author 小陈老师
 *
 */
public class CarPrice {
	//汽车价格ID
	private Integer Car_PriceId;
	//汽车型号ID
    private Integer car_ModelId;
    //出售价格
    private Integer car_Sell;
    //出租价格
    private Integer car_Rant;
    //进货价格
    private Integer car_Inprise;
    //备注
    private String car_Remark;
    //删除状态
    private Integer car_Isdel;
    
	
	public Integer getCar_PriceId() {
		return Car_PriceId;
	}
	public void setCar_PriceId(Integer car_PriceId) {
		Car_PriceId = car_PriceId;
	}
	public Integer getCar_ModelId() {
		return car_ModelId;
	}
	public void setCar_ModelId(Integer car_ModelId) {
		this.car_ModelId = car_ModelId;
	}
	public Integer getCar_Sell() {
		return car_Sell;
	}
	public void setCar_Sell(Integer car_Sell) {
		this.car_Sell = car_Sell;
	}
	public Integer getCar_Rant() {
		return car_Rant;
	}
	public void setCar_Rant(Integer car_Rant) {
		this.car_Rant = car_Rant;
	}
	public Integer getCar_Inprise() {
		return car_Inprise;
	}
	public void setCar_Inprise(Integer car_Inprise) {
		this.car_Inprise = car_Inprise;
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