package com.zhanghongfei.homework;

public class EnglishTeachers extends Person implements AllTeachers{
	public void printClassName() {
		System.out.println("this.getClass().getClassName()");
	}
	public void function() {
		System.out.println("英语老师教英语");
	}
}
