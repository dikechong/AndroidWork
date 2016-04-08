package com.qiaoxi.bean;

public class Dish {
	//��Ʒ���
	private int dishId;
	//�˵�����
	private String dishName;
	//ƴ����д
	private String abbrevation;
	//ͼƬ·��
	private String imageUrl;
	//��λ
	private String unit;
	//����
	private double price;
	//��Ա��
	private double clientPrice;
	//�����
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

	//�ۿ���
	private double discount;
	//��������
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
