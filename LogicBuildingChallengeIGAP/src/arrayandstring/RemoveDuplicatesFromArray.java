package arrayandstring;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,1,4,3,5};
		Arrays.sort(arr);
		
		int [] temp = new int [arr.length];
		
		int j=0;
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp [j++] = arr[arr.length-1];
		
		System.out.println("Array After Remove Duplicates: ");
		for(int i = 0; i < j ; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
