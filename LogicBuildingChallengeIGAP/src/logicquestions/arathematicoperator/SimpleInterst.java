package logicquestions.arathematicoperator;

import java.util.Scanner;

public class SimpleInterst {

	public static void main(String[]args) {
		float principle,rate,time,si;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter time ( in days):");
		time=sc.nextFloat();
		
		System.out.println("Enter Principle: ");
		principle=sc.nextFloat();
		
		System.out.println("Enter Rate: ");
		rate=sc.nextFloat();
		
		si=principle*rate*time/100;
		System.out.println("Simple Intrest is: " + si);
	}
}
