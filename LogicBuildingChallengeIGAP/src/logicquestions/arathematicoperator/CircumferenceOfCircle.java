package logicquestions.arathematicoperator;

import java.util.Scanner;

public class CircumferenceOfCircle {

	public static void main(String[] args) {

		double area;
		float radius;
		double circumference;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius=sc.nextFloat();
		
		area=radius * radius * 3.14;
		
		System.out.println("Area Of Circle is : " + area);
		
		circumference=2 * 3.14 * radius;
		System.out.println("Circumference of circle:" + circumference); 
		
											
		
		
		
	}

}
