package com.zhanghongfei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetWay {
	public void setFunction() {
		HashSet<Student> student=new HashSet();
		for(int i=20070301,j=1;i<=20070330;i++,j++) 
        { 
            student.add(new Student(i,(int) (40*Math.random()+60), "学生"+j)); 
        }
		ArrayList<Student>al=new ArrayList(student);
		Collections.sort(al,new GradeSort());
		for(Student a:al) {
			System.out.println("学号："+a.studentID+" 姓名："+a.name+"成绩："+a.grade);
		}
		System.out.println("  ");
	}
}
