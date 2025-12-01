package decisionmaking.com;

import java.util.Scanner;

public class CalculatorUsingSwitchCase {

	public static void main(String[]args) {
		double num1 , num2, result;
		char operator;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose Operator: +, - , * and / : ");  // Ask User to Enter Operator
		operator =sc.next().charAt(0);
		
		System.out.println("Enter First Numebr: ");
		num1 = sc.nextDouble();
		
		System.out.println("Enter Second Number: ");
		num2=sc.nextDouble();
		
		switch(operator) {
			// perform addition between numbers
			case '+': 
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
				
			// perform subtraction between numbers
			case '-':
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
				
			// perform multiplication between numbers
			case '*':
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
				
			// perform division between numbers	
			case '/':
				result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
				
			default:
				System.out.println("Invalid Operator!..");
				break;
		}
	}
}
