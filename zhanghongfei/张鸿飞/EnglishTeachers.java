package com.zhanghongfei.homework;

public class EnglishTeachers extends Person implements AllTeachers{
	public void printClassName() {
		a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("英语老师教英语");
	}
}
