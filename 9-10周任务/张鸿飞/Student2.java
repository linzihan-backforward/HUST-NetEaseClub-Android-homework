package com.zhanghongfei;

public  class Student2 implements Comparable<Student2>{
	public String name;
	public int grade;
	public Student2(int grade,String name){  
        this.grade =grade;  
        this.name=name;  
	}
	  public int compareTo(Student2 o) {  
          
	        if(this.grade>o.grade)    
	            return 1;    
	            if(this.grade==o.grade)    
	            {
	             return this.name.compareTo(o.name);    
	            }    
	            return -1;    
	  
	    }
	  }