package com.hujunjie.highschool;

public abstract class WorkPartment {
	public abstract void work(); 
	public void putName() {
		System.out.println(this.getClass().getName());
	}

}
