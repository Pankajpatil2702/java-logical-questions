package decisionmaking.com;

import java.util.Scanner;

public class ValidTriangleCheck {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Length of Side1: ");
		double side1 = sc.nextDouble();
		
		System.out.println("Enter the Length of Side2: ");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the Length of Side3: ");
		double side3 = sc.nextDouble();
		
		if(side1 <= 0 || side2 <= 0 || side3 <= 0) {
			System.out.println("The Side Of Triangel is Positive..");
		}
		else if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2 ) {
			System.out.println("Triangle is Valid..");
		}
		else {
			System.out.println("Triangle is InValid..");
		}
	}
}
