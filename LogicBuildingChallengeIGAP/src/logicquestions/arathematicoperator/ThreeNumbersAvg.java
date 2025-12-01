package logicquestions.arathematicoperator;

import java.util.Scanner;

public class ThreeNumbersAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First num: ");
		int firstNum=sc.nextInt();
		
		System.out.println("Enter Second Num:");
		int secondNum=sc.nextInt();
		
		System.out.println("Enter Third Num:");
		int thirdNum=sc.nextInt();
		
		int result=firstNum+secondNum+thirdNum/3;
		
		System.out.println("Three number avrage is: " + result);
	}

}
