package loopsandpatterns;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (2 * i + 1); // Generates the i-th odd number (1, 3, 5, ...)
        }

        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
        scanner.close();
	}

}
