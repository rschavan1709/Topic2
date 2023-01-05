package com.neosoft.set;

public class Student1 {
	int rollNo;
	String name;
	int marks;
	
	public Student1(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		return this.getRollNo() == ((Student1)obj).getRollNo() ;
	}
	@Override
	public int hashCode() {
		return rollNo;
	}
	
	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}

}
