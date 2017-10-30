package com.highschool;

public class Master extends Manager implements IGetSalary{
	
	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("    从学校获得的利润中提取工资");

	}

	@Override
	public void manage() {
		// TODO Auto-generated method stub
		System.out.println("校长 ：管理学校发展方向");

	}

}
