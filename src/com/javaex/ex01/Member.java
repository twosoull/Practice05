package com.javaex.ex01;

public class Member {
	//필드
	private String id;
	private String name;
	private int point;
	
	
	//게터세터
	//네임
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//포인트
	public void setpoint(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	//아이디
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void showInfo() {
		System.out.println("회원정보: "+name+"("+id+")"+", "+point+"점");
	}
}
