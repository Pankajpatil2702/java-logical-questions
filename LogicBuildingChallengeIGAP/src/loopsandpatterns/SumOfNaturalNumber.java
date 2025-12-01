package loopsandpatterns;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Natural Number:");
		sc.close();
		int naturalNum=sc.nextInt();
		int sum=0;
		for(int i=0; i <= naturalNum; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of Naturals Number is: " + sum);

	}

}
