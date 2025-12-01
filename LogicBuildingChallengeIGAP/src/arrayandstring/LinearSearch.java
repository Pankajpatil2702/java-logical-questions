package arrayandstring;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		int target=50; // element to search
		
		boolean found = false;  // flag to check result
		
		for(int i=0; i < arr.length; i++) {
			
			if(arr[i] == target) {		// check each element
				
				System.out.println("Element found at index: " + i);
				
				found=true;
				break;	
			}
		}
		if(!found) {
			System.out.println("Element not found in array.");
			
		}
		

		
	}

}
