package loopsandpatterns;

import java.util.Scanner;

public class PerfectNumberCheck {
	public static boolean isPerfectNumber(int num) {
        if (num <= 0) { // Perfect numbers are positive integers
            return false;
        }

        int sumOfDivisors = 0;
        // Iterate from 1 up to (but not including) the number
        for (int i = 1; i < num; i++) {
            if (num % i == 0) { // If 'i' is a divisor
                sumOfDivisors += i; // Add it to the sum
            }
        }

        // If the sum of proper divisors equals the number, it's perfect
        return sumOfDivisors == num;
    }

	public static void main(String[]args) {
		Scanner	 scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
	}
}
