package loopsandpatterns;

import java.util.Scanner;

public class ArmstrongNumberCheck {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check: ");
	        int originalNumber = scanner.nextInt();
	        scanner.close();

	        int number = originalNumber;
	        int sumOfPowers = 0;
	        int numberOfDigits = String.valueOf(originalNumber).length(); // Get number of digits

	        while (number > 0) {
	            int digit = number % 10; // Get the last digit
	            
	            // Add digit raised to power of number of digits
	            sumOfPowers += Math.pow(digit, numberOfDigits); 
	            number /= 10; // Remove the last digit
	        }

	        if (sumOfPowers == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }
	    }

}
