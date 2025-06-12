package Interview_Programs;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Shubham";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}

		System.out.println(rev);
	}

}
