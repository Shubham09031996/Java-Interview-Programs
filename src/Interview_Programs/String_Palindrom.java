package Interview_Programs;

public class String_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="level";
		String og=name;
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}

	if(og.equals(rev)) {
		System.out.println("Given "+og+" is palindrom word");
	}
	else {
		
		System.out.println("Given "+og+" is not palindrom word");
	}

	}

}
