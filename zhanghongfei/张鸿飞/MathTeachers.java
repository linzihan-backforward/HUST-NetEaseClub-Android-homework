package com.zhanghongfei.homework;

public class MathTeachers extends Person implements AllTeachers{
	public void printClassName() {
		System.out.println("this.getClass().getClassName()");
	}
	public void function() {
		System.out.println("数学老师教数学。");
	}
}
