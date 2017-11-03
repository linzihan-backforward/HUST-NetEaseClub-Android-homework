package com.zhanghongfei.homework;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person principal=new Principal();
		principal.printClassName();
		principal.function();
		Person administator=new Administrator();
		administator.printClassName();
		administator.function();
		Person chineseTeacher=new ChineseTeachers();
		chineseTeacher.printClassName();
		chineseTeacher.function();
		Person mathTeacher=new MathTeachers();
		mathTeacher.printClassName();
		mathTeacher.function();
		Person englishTeacher=new EnglishTeachers();
		englishTeacher.printClassName();
		englishTeacher.function();
		OtherTeachers otherTeachers=new OtherTeachers();
		otherTeachers.printClassName();
		otherTeachers.function();
		SchoolCounselor schoolCounselors=new SchoolCounselor();
		schoolCounselors.printClassName();
		schoolCounselors.function();
		Person student=new Students();
		student.printClassName();
		student.function();
	}
}
