package loopsandpatterns;

public class PyramidStarPattern {
	public static void main(String[]args) {
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for(int s=1; s <= i*2-1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
