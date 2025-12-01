package loopsandpatterns;

public class PascalsTrianglePattern {
	public static void main(String [] args) {
		
		int rows=5; // number of rows
		
		for(int i=0; i<rows; i++) {
			int coef=1;
			
			// print leading spaces(alignment)
			for(int space=0; space < rows-i; space++) {
				System.out.print(" ");
			}
			
			// print values
			for(int j=0; j<=i; j++) {
				System.out.print(coef+ " ");
				
				coef = coef * (i-j) / (j+1); //update coefficient
			}
			System.out.println();  // move to next line
		}
	}

}
