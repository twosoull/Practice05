package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;

    public Friend() {
    	
    }
    public Friend(String name, String hp, String school) {
    	this.name =name;
    	this.hp = hp;
    	this.school = school;
    }
    // getter/setter 작성
    //이름
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getName() {
    	return name;
    }
    //핸드폰
    public void setHp(String hp) {
    	this.hp = hp;
    }
    public String getHp() {
    	return hp;
    }
    //학교
    public void setSchool(String school) {
    	this.school = school;
    }
    public String getSchool() {
    	return school;
    }
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
