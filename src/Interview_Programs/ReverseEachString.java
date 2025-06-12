package Interview_Programs;

public class ReverseEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="I love my india";
	
	    String arr[]=name.split(" ");
	    String reversed="";
	    for(int i=0;i<arr.length;i++) {
	    	String word=arr[i];
	    	String rev="";
	    	for(int j=word.length()-1;j>=0;j--) {
	    		rev=rev+word.charAt(j);
	    	}
	    	reversed=reversed+rev+" ";
	    }
		
		
		System.out.println(reversed);
	}

}
