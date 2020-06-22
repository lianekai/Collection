package com.lianyikai.src1;

public class ProductBean {
	private int id;
	private String name;
	private double price;
	
	public ProductBean(){
		
	}
	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public ProductBean(int id,String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public ProductBean(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
