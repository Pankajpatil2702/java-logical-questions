package decisionmaking.com;

import java.util.Scanner;

public class QuadraticEquationRoots {
	
	// distinct means different

	public static void main(String[] args) {
		double r1,r2;          // a*2+b*+c
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a, b and c: ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		 
		double d = (b*b) - (4*a*c); // formula of discriminate(d)
		
		if(d == 0) {   // real and equal
			System.out.println("Roots are real and equal");
			r1=r2=-b/(2*a);         // find the root   // two formulas are same so declare in once and print different
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
		}
		
		else if(d > 0) {   // real and distinct 
			System.out.println("Roots are real and distinct");
			r1=(-b+Math.sqrt(d)/(c*a));
			r2=(-b-Math.sqrt(d)/(c*a));
			System.out.println("R1 = " + r1);
			System.out.println("R2 = " + r2);
			
		}
		else {  // d < 0    // distinct and imaginary     
			System.out.println("Roots are distinct and imaginary");
			double x= -b/(2*a);    // declare separate variables
			double y= Math.sqrt(-d)/(2*a);
			System.out.println("R1 = " + x + "  +i: " + x);
			System.out.println("R2 = " + y + "  -i: " + y);
			
		}

	}

}
