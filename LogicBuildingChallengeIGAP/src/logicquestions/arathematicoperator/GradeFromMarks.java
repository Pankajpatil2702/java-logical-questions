package logicquestions.arathematicoperator;

import java.util.Scanner;

public class GradeFromMarks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students Marks:");
		int marks=sc.nextInt();
		char grade;
		
		if(marks >= 85 && marks <= 100) {
			//System.out.println("Students Getting Grade 'A' .");
			grade = 'A';
		}
		else if(marks >= 70 && marks <= 85) {
			//System.out.println("Students Getting Grade 'B'.");
			grade = 'B';
		}
		else if(marks >= 55 && marks <= 70) {
			//System.out.println("Students Getting Grade 'C'.");
			grade = 'C';
		}
		else {
			//System.out.println("Student is Fail.");
			grade = 'F';
		}
		System.out.println("The Student Grade is: " + grade);
	}

}
