package com.zhanghongfei;


import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MapWay {
	public void mapFunction() {
		TreeMap<Student2,Integer> students=new TreeMap<Student2,Integer>();
		for(int a=20070301,b=1;a<=20070330;a++,b++) 
        { 
            int grade=(int)(40*Math.random()+60);
            students.put(new Student2(grade,"学生"+b),a);
        }
		Set<Student2> k=students.keySet();  
        	Iterator<Student2> it=k.iterator();  
          
        while(it.hasNext()){  
            Student2 key=it.next();  
            Integer number=students.get(key);  
              
            System.out.println("学号："+number+"    "+"姓名："+key.name+"    "+"成绩:"+key.grade);  
        }   
        System.out.println("  ");
	}
} 
