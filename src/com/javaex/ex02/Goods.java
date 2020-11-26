package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;
	//기본 생성자가 없음
	
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	//private 라 꺼낼수없음
	public void setName(String name) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}








