package logicquestions.arathematicoperator;

import java.util.Scanner;

public class Convert_Celsius_To_Fahrenheit {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius: ");
		int celsius=sc.nextInt();
		
		int fahrenheit=(celsius * 9/5) + 32;           //F = (C × 9/5) + 32
		System.out.println("Celsius To Fahrenheit is: " + fahrenheit);
	}

}
