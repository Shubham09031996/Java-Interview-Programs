package Basics;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="MADA7M";
		String rev="";
		String og=name;
		
		int len=name.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
		if(og.equals(rev)) {
			System.out.println("String is palindrom");
		}
		
		else {
			System.out.println("String is not a palidrom");
		}
	}

}
