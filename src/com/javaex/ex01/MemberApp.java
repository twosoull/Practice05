package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member user01 = new Member();
		
		user01.setName("정우성");
		user01.setId("jws");
		user01.setpoint(50000);
		
		Member user02 = new Member();
		
		user02.setName("유재석");
		user02.setId("yjs");
		user02.setpoint(30000);
		
		Member user03 = new Member();
		
		user03.setName("이효리");
		user03.setId("lhr");
		user03.setpoint(40000);
		
		user01.showInfo();
		user02.showInfo();
		user03.showInfo();
		
	}

}
