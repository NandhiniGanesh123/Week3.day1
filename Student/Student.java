package org.Student;

import org.department.Department;

public class Student extends Department{

	
	public void studentName() {
	
		System.out.println("The student name id:"+"Nandhini");
	}
	
	public void studentDept() {
		System.out.println("Student Depart is: "+"Electrical Engineering");
		
	}
	
	public void studentid() {
		
		System.out.println("The student id: "+"1234");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st=new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentid();
		st.studentName();
	}

}
