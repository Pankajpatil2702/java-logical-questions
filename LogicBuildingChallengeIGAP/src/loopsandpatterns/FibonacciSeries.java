package loopsandpatterns;

public class FibonacciSeries {

	public static void main(String[] args) {

		// A series of numbers in which each number is the sum of the two preceding numbers
		
		// 0 1 1 2 3 5 8 13 21 34
		int n1=0, n2=1 , sum=0;
		
		System.out.print(n1 + " " + n2); // this is use for number1 and number2 between space
		
		for(int i = 1; i < 10; i++) {
			
			sum = n1 + n2; // 0 + 1 + 1 + 2 + 3 + 5 if number is < 10
			System.out.print(" " + sum);
			n1=n2;
			n2=sum;
		}
	}

}
