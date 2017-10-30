package com.github.homework;

public class Students extends Person {
	public void printClassName() {
		String a=this.getClass().getClassName();
		System.out.println(a);
	}
	public void function() {
		System.out.println("学生好好学习);
	}
}
