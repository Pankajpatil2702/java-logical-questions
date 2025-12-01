package arrayandstring;

public class FindSumAndAvarageOfArrayElement {
	
	public static void main(String[]args) {
		
		int[] arr= {10,20,30,40,50};
		int sum=0;
		
		for(int i=0; i < arr.length; i++) {
			
			sum= sum+arr[i];  // sum of array
		}
		
		double avg= sum/arr.length;   // average  of array
		
		System.out.println("sum is" + sum);
		System.out.println("Avg is: " + avg);
	}

}
