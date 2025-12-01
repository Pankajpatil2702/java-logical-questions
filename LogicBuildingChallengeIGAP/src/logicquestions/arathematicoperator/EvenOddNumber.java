package logicquestions.arathematicoperator;

import java.util.Scanner;

class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Positive:");
		}
		else {
			System.out.println("Number is Negative:");
		}

	}

}
