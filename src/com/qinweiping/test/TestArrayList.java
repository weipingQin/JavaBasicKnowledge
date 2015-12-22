package com.qinweiping.test;

import java.util.ArrayList;
import java.util.List;

import com.qinweiping.model.Student;

public class TestArrayList {
	
	///setp1 先将数组进行填充
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student student1 = new Student();
		student1.setStudentName("qwp");
		student1.setGrade("100");
		studentList.add(student1);
	}
	
}
