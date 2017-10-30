package com.zhanghongfei.homework;

public class MathTeachers extends Person implements AllTeachers{
	public void printClassName() {
		a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("数学老师教数学。");
	}
}
