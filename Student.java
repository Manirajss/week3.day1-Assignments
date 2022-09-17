package org.department;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("Student name: M.Rajalakshmi");
	}
	public void studentDept() {
		System.out.println("Department of the student: EEE");
	}
	public void studentId() {
		System.out.println("Student ID: 96152");
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}
