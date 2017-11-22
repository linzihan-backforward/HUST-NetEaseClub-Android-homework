package com.zhanghongfei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetWay {
	public void setFunction() {
		HashSet<Student> student=new HashSet();
		for(int a=20070301,b=1;a<=20070330;a++,b++) 
        { 
            student.add(new Student(a,(int) (40*Math.random()+60), "学生"+b)); 
        }
		ArrayList<Student>stu=new ArrayList(student);
		Collections.sort(stu,new GradeSort());
		for(Student stu1:stu) {
			System.out.println("学号："+stu1.studentID+" 姓名："+stu1.name+"成绩："+stu1.grade);
		}
		System.out.println("  ");
	}
}
