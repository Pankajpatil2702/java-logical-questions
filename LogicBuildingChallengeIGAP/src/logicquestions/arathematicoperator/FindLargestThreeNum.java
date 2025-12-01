package logicquestions.arathematicoperator;

import java.util.Scanner;

public class FindLargestThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter Second Number: ");
		int b=sc.nextInt();
		
		System.out.print("Enter Third Number: ");
		int c=sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("First Number is Largest: " + a);
			
		}
		else if(b > a && b > c) {
			System.out.println("Second Number is Largest: " + b);
		}
		else {
			System.out.println("Third Number is Largest: " + c);
		}

	}

}
