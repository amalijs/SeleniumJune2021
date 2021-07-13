package org.studentweek3.day1Assgn2;

import org.departmentweek3.day1Assg2.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name is John Britto");
	}
	
	public void studentDept() {
		System.out.println("Student Department is Mathematics");
		
	}
	
	public void studentId() {
		System.out.println("Student id MBA-MT-1023");
		
	}

	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();

	}

}
