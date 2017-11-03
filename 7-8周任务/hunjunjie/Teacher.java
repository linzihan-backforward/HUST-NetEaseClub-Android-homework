package com.hujunjie.highschool;

public class Teacher extends LearnPartment implements IGetSalary {

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("     从学习部门获得工资");

	}

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("老师  ：和学生交流学习");

	}

}
