package loopsandpatterns;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i <= num ; i++) {
			
				 
				 sum=sum + 2 *  i;
			
		}
		System.out.println("Sum of First Even Numbers: " + sum);
		sc.close();
		
	}

}
