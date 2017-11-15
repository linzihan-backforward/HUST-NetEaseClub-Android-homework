package com.yucenhao.homework;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Headmaster();
		
		Person obj2=new MathTeacher();
		
		Person obj3=new ChiTeacher();
		
		Person obj4=new OtherTeacher();
		
		Person obj5=new StudentCounselor();
		
		Person obj6=new Student();
		
		
		
		obj1.printName();
		obj1.manage();
		
		obj2.printName();
		obj2.teach();
		
		obj3.printName();
		obj3.teach();
		
		obj4.printName();
		obj4.teach();
		
		obj5.printName();
		obj5.manage();
		
		obj6.printName();
		obj6.study();
		
	}

}
