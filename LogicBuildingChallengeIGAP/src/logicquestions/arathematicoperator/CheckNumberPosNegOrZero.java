package logicquestions.arathematicoperator;

import java.util.Scanner;

public class CheckNumberPosNegOrZero {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		double number=sc.nextDouble();
		
		if(number > 0) {
			System.out.println(number + "Number is Positive..");
			
		}else if(number < 0){
			System.out.println(number + "Number is Negative");
		}
		else {
			System.out.println(number + "Number is Zero");
		}

	}

}
