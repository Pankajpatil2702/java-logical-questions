package logicquestions.arathematicoperator;

import java.util.Scanner;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		int length, width, perimeter,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Length: ");
		length=sc.nextInt();
		
		System.out.println("Enter Width: ");
		width=sc.nextInt();
		
		area=length*width;    //  Area (A) = length (l) × width (w) 
		System.out.println("Area of rectangle is : " + area);
		
		System.out.println("Enter Length: ");
		length=sc.nextInt();
		
		System.out.println("Enter Width: ");
		width=sc.nextInt();
		perimeter= 2 * (length+width); // Perimeter (P) = 2 × (length (l) + width (w)) 
		System.out.println("Perimeter of Rectangle is : " + perimeter);
		sc.close();
	}

}
