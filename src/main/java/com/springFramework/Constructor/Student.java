package com.springFramework.Constructor;

public class Student {
	private String Name;
	private int StudentId;
	private Mark mark;

	public Student(String Name, int StudentId, Mark mark) {
		this.Name = Name;
		this.StudentId = StudentId;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return this.Name + ":" + this.StudentId + "{" + this.mark.marks + "}";
	}

}
