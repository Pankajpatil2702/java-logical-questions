package logicquestions.arathematicoperator;

public class SwapTwoNum {

	public static void main(String[] args) {
//		int a=10,b=20;     // using third variable
//		int t=a;
//		a=b;
//		b=t;
		
		//System.out.println("a : " + a + " b: " + b);
		
//		int x=10;  // without third variable
//		int y=20;
//		
//		x=x+y;
//		y=x-y;
//		x=x-y;
//		
		
//		System.out.println("x: " + x + " y: " + y);
		
		int a=10, b=20;  // without using third variable with
						// arithematic operator "* " & "/"
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a: " + a + " b: " + b);

	}

}
