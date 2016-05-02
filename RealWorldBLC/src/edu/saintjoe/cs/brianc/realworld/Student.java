package edu.saintjoe.cs.brianc.realworld;

public class Student {
	private String name;
	private String gender;
	private int classYr;
	private int age;
	private int grade;
	//this is the new data member for part C
	
	/* Data members above, methods below */
	
	// Right now a "full data" constructor only
	public Student(String newName, String newGender, int newClassYr, int newAge, int newGrade) {
		name = newName;
		gender = newGender;
		classYr = newClassYr;
		age = newAge;
		grade = newGrade;
	}

	
	// Accessors and Mutators for the data members
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(String newGender) {
		gender = newGender;
	}
	public String getGender() {
		return gender;
	}

	public void setClassYr(int year) {
		classYr = year;
	}
	public int getClassYr() {
		return classYr;
	}
	public void setGrade(int newGrade) {
		grade = newGrade;
	}
	public int getGrade() {
		return grade;
	}
	// Above is the setter and getter for the new data member "grade"
	public String toString() {
		return ("Student: " + name + " Gender: " + gender + " Class Year: " + classYr + " Age: " + age + "Grade: " + grade);
	}
	// Add the new value "grade" to the return line 
	
}
