package cn.com.car.bean;

import java.util.List;

/**
 * 
 * @author 小陈老师
 *
 * @param <T>
 */
public class PageBean<T> {
	//当前页
	private int currentPage = 1;
	//每页显示条数
	private int maxCount = 5;
	//总桌数
	private int allNum;
	//总页数
	private int pageNum;
	//分页数据
	private List<T> datas;
	
	public PageBean(){}
	
	public PageBean(int currentPage, int maxCount, int allNum, int pageNum) {
		super();
		this.currentPage = currentPage;
		this.maxCount = maxCount;
		this.allNum = allNum;
		this.pageNum = pageNum;
	}
	
	
	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getAllNum() {
		return allNum;
	}
	public void setAllNum(int allNum) {
		this.allNum = allNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
}	
