package com.hujunjie.highschool;

public class Worker extends WorkPartment implements IGetSalary {

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("     从工作部门获得工资");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("工人 ：打扫学校卫生，维修学校公共物品");

	}

}
