package com.qiaoxi.bean;

public class Dish {
	//菜品编号
	private int dishId;
	//菜单名字
	private String dishName;
	//拼音缩写
	private String abbrevation;
	//图片路径
	private String imageUrl;
	//单位
	private String unit;
	//单价
	private double price;
	//会员价
	private double clientPrice;
	//服务费
	private double serverPrice;
	public Dish(int dishId, String dishName, String abbrevation, String imageUrl, String unit, double price,
			double clientPrice, double serverPrice, double discount, String printDepartment) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.abbrevation = abbrevation;
		this.imageUrl = imageUrl;
		this.unit = unit;
		this.price = price;
		this.clientPrice = clientPrice;
		this.serverPrice = serverPrice;
		this.discount = discount;
		this.printDepartment = printDepartment;
	}
	
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}

	//折扣率
	private double discount;
	//出单部门
	private String printDepartment;
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	public String getAbbrevation() {
		return abbrevation;
	}
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getClientPrice() {
		return clientPrice;
	}
	public void setClientPrice(double clientPrice) {
		this.clientPrice = clientPrice;
	}
	public double getServerPrice() {
		return serverPrice;
	}
	public void setServerPrice(double serverPrice) {
		this.serverPrice = serverPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getPrintDepartment() {
		return printDepartment;
	}
	public void setPrintDepartment(String printDepartment) {
		this.printDepartment = printDepartment;
	}
	
}
