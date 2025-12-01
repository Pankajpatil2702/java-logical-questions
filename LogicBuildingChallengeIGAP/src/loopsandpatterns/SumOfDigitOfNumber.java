package loopsandpatterns;

public class SumOfDigitOfNumber {

	// number = 1234
	// 1+2+3+4 sum = 10
	// using modular division operation  "%" and division operator "/"
	public static void main(String[]args) {
		int num=1234;
		//int num=555;
		int sum=0;
		
		while(num > 0) {   // 1234 123 12 1
			sum = sum + num % 10; // 4 + 3 + 2 + 1
			num = num/10;  // 123 12 1 0 
			
		}
		System.out.println("Sum of digit in number: " + sum);
		
	}
}
