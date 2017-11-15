package com.zhanghongfei;

import java.util.ArrayList;
import java.util.Collections;

public class ListWay {

	public void listFunction() {
		// TODO Auto-generated method stub
		ArrayList<Student>stu=new ArrayList<Student>(); 
        for(int a=20070301,b=1;a<=20070330;a++,b++) 
        { 
            stu.add(new Student(a,(int) (40*Math.random()+60), "学生"+b)); 
        }
        Collections.sort(stu,new GradeSort());
        for(Student stu1:stu)
        System.out.println("学号："+stu1.studentID+" 姓名："+stu1.name+"成绩："+stu1.grade);
	System.out.println("  ");
	}

}
