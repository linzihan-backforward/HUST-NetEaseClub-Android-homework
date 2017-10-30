package com.zhanghongfei.homework;

public class Principal extends Person {
	public void printClassName() {
		a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("校长管理整个学校");
	}
}
