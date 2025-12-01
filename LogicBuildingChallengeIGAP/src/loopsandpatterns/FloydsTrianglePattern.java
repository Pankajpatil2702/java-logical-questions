package loopsandpatterns;

public class FloydsTrianglePattern {

	public static void main(String [] args) {
		
		// Floyds triangle is a right-angled triangle of consecutive natural numbers.
		// Starts from 1 and increases row by row.
		
		int rows=4;
		int num=1;  // Starting number
		
		for(int i = 1; i <= rows; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++; // increment the number
			}
			System.out.println(); // new line
		}
		
	}
}
