package com.zhanghongfei;

import java.util.Comparator;

class GradeSort implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.grade>s2.grade) {
			return 1;
		}
		if(s1.grade<s2.grade) {
			return -1;
		}
		if(s1.grade==s2.grade) {
			return s1.name.compareTo(s2.name);
		}
		return 0;
		
	}
}
