package logicquestions.arathematicoperator;

import java.util.Scanner;

public class MaximumOfFourNumber {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int num3 = sc.nextInt();
		
		System.out.println("Enter Fourth Number:");
		int num4 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println(num1 + " is greatest");
		}
		else if(num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println(num2 + " is grestest");
		}
		else if(num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println(num3 + " is greatest");
		}
		else {
			System.out.println(num4 + " is greatest");
		}
		
	}

}
