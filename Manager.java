package com.hujunjie.highschool;

public abstract class Manager {
	public abstract void manage();
	public void putName() {
		System.out.println(this.getClass().getName());
	}
	

}
