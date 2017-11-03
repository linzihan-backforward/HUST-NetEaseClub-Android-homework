package com.hujunjie.highschool;

public abstract class LearnPartment {
	public abstract void learn();
	public void putName() {
		System.out.println(this.getClass().getName());
	}

}
