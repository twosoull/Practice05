package com.javaex.ex10;

public class Book {
    
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	//생성자
	public Book(int bookNo ,String title,String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	//게터세터
	
    
    public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	//메소드
	public void rent(int num){
		if (num>=0||10>num) {
			setStateCode(0);
			System.out.println(getTitle()+"이(가) 대여됐습니다.");
		}
		
	}
	public void print() {
		if (stateCode == 0) {
			System.out.print("대여중\n");
		}else if(stateCode == 1) {
			System.out.print("재고있음\n");
		}
    	
    }
    
    
}
