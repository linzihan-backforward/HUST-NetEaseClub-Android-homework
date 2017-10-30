package com.zhanghongfei.homework;

public class ChineseTeachers extends Personimplements AllTeachers{
	public void printClassName() {
		a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("语文老师教语文。");
	}
}
