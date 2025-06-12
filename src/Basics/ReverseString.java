package Basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name="Chauhan";
//		int len=name.length();
//		String rev="";
//		
//		for(int i=len-1;i>=0;i--) {
//		rev=rev+name.charAt(i);
//		}
//		System.out.println(rev);
		
		String name="Shubham";
		char [] c=name.toCharArray();
		String rev="";
		
		int len=c.length;
		for(int i=len-1;i>=0;i--) {
			rev=rev+c[i];
		}
		System.out.println(rev);
		

	}

}
