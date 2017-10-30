package com.zhanghongfei.homework;

public class SchoolCounselor extends Person {
	public void printClassName() {
		a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("辅导员管理学生。");
	}
}
