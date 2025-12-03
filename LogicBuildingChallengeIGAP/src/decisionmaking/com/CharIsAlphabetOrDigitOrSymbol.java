package decisionmaking.com;

public class CharIsAlphabetOrDigitOrSymbol {

	public static void main(String[]args) {
		 char ch1 = 'A';
	     char ch2 = '5';
	     char ch3 = '@';

	        System.out.println(ch1 + " is a letter: " + Character.isLetter(ch1)); // true
	        System.out.println(ch1 + " is a digit: " + Character.isDigit(ch1));   // false

	        System.out.println(ch2 + " is a letter: " + Character.isLetter(ch2)); // false
	        System.out.println(ch2 + " is a digit: " + Character.isDigit(ch2));   // true

	        System.out.println(ch3 + " is a letter: " + Character.isLetter(ch3)); // false
	        System.out.println(ch3 + " is a digit: " + Character.isDigit(ch3));   // false
	        System.out.println(ch3 + " is a symbol: " + !Character.isLetterOrDigit(ch3)); // true
		
				
	}
}
