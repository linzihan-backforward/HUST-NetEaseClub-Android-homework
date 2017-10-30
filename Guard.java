package com.highschool;

public class Guard extends WorkPartment implements IGetSalary {

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("     从工作部门获得工资");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("门卫 ：管理学校安全，担任门卫");

	}

}
