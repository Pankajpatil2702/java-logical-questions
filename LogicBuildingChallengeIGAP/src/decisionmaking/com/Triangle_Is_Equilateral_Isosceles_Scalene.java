package decisionmaking.com;

import java.util.Scanner;

public class Triangle_Is_Equilateral_Isosceles_Scalene {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Side Of Triangle: ");
		double side1 = sc.nextDouble();
		sc.close();
		System.out.print("Enter Second Side Of Triangle: ");
		double side2 = sc.nextDouble();
		
		System.out.print("Enter Third Side Of Triangle: ");
		double side3 = sc.nextDouble();
		
		if(side1 == side2 && side2 == side3) {   // if side 1 ,2 ,3 sides are equals it is an Equilateral Triangle  
			System.out.println("It is an Equilateral Triangle");
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3) {   // if to side are equals it is Isosceles Triangle
			// if side1 ,2 
			System.out.println("It is an Isosceles Triangle");
		}
		else {
			System.out.println("It is an Scalene Triangle");  // if three sides are not equals then it is Scalene Triangle
		}
	}

}
