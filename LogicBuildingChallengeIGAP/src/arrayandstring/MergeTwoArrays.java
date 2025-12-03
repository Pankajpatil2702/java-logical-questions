package arrayandstring;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		
		// create new array with total size
		int c[] = new int[a.length + b.length];
		
		int index=0;  // to track position in merged array
		
		// copy elements of array 'a' to 'c'
		for(int i =0; i < a.length; i++) {
			
			c[index] = a[i];
			index++;
			
		}
		
		// copy elements to array 'b' to 'c'
		for(int j =0; j < b.length ; j++) {
			
			c[index]  = b[j];
			index++;
		}
		
		//print merged array
		System.out.println("Merged Array: " + Arrays.toString(c ));
		

	}

}
