package logicquestions.arathematicoperator;

import java.util.Scanner;

public class FindLargestTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int firstNum=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int secondNum=sc.nextInt();
		
		if(firstNum > secondNum) {
			System.out.println("First Number is Largest: " + firstNum);
		}
		else {
			System.out.println("Second Number is Largest: " + secondNum);
		}
		
	}

}
