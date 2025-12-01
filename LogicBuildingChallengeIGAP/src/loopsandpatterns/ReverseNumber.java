package loopsandpatterns;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		sc.close();
		int rev=0;
		
		while(num != 0) {
			rev=rev*10+num%10;
			// case 1= 0+1234%10=4
			// case 2= 40+3=43
			// case 3= 430+2=432
			// case 4= 4320+1=4321
			num=num/10;
			//case1 = 1234/10=123
			//case2 = 123/10=12
			//case3 = 12/10=1
			
		}
		System.out.println("Reverse Number is: " + rev);

	}

}
