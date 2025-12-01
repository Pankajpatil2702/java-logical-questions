
package decisionmaking.com;

import java.util.Scanner;

public class AbsoluteValueOfNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		
		int absInt= Math.abs(num);
		System.out.println("Absolute Value is: " + absInt);
	}

}
