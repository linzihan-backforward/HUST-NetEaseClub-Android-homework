package com.hujunjie.highschool;

public class ScienceStudent extends Student implements IStudy {

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("理科生学习理科");

	}

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("理科生也要学习语文，数学，英语");

	}

}
