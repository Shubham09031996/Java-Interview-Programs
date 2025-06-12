package Interview_Programs;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="MADAM";
		String og=name,rev="";
	
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		
		if(og.equals(rev)) {
			System.out.println(og+" is a palindrom");
		}
		else {
			System.out.println(og+" is not a palindrom");
		}
	}

}
