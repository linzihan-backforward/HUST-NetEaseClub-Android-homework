package com.hujunjie.highschool;

public class Guard extends WorkPartment implements IGetSalary {

	@Override
	public void getSalary() {
		// TODO Auto-generated method stub
		System.out.println("     �ӹ������Ż�ù���");

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("���� ������ѧУ��ȫ����������");

	}
	
	public void patrol(){
		System.out.println("     �Ĵ�Ѳ��");
	}

}