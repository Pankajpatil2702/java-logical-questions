package arrayandstring;

public class ReverseString {

	public static void main(String [] args) {
		
		String str="pankaj";
		String rev="";
		int length=str.length();
		
		for(int i=length-1; i >= 0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.print("After Reverse String : " + rev);
	}
}
