package students;

import java.util.Scanner;
public class StudentDetails {
private String name;
private int marks;
public  StudentDetails(String name,int marks) {
	this.name=name;
	this.marks=marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public char calculateGrade() {
	if(marks>=90) {
		return 'A';
	}
	else if(marks>=80) {
		return 'B';
	}
	else if(marks>=70) {
		return 'C';
	}
	else if(marks>=60) {
		return 'D';
	}
	else {
		return 'F';
	}
}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter the Students name:");
	String name=scanner.nextLine();
	System.out.print("Enter the students marks:");
	int marks=scanner.nextInt();
	 StudentDetails  StudentDetails1=new  StudentDetails(name,marks);
	 System.out.print("Student name:"+ StudentDetails1.getName());
	 System.out.println("Stuent marks:"+ StudentDetails1.getMarks());
	 System.out.println("Student Grade:"+ StudentDetails1.calculateGrade());
	 scanner.close();
}
}