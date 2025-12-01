package loopsandpatterns;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Factorial Number: ");
		int num=sc.nextInt();
		sc.close();
		long factorial=1;
		
		for(int i=1; i <= num; i++) {
			factorial = factorial*i;
			
		}
		System.out.println("Factorial Number is: " + factorial);
	}

}
