package org.prince.in;

public class Student {

	private String studentName;

	public Student() {
		System.out.println("Student Constructor Created....");
	}

	public void setStudentName(String studentName) {
		System.out.println("Setter method called....");
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + "]";
	}

}
