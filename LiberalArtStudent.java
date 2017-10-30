package com.highschool;

public class LiberalArtStudent extends Student implements IStudy {

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("文科生学习文科");

	}

	@Override
	public void learn() {
		// TODO Auto-generated method stub
		System.out.println("文科生也要学习语文，数学，英语");

	}

}
