package loopsandpatterns;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		int org_Num=num;
		int rev=0;
		
		while(num != 0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(org_Num == rev) {
			System.out.println(rev + "Number is Palindrome Number");
		}
		else {
			System.out.println(rev + " Number is Not Palindrme Number");
		}

	}

}
