package Interview_Programs;

public class SubStringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Shubham";//ubhamsh
		//           0123456
		
		//System.out.println(name.substring(2));
		//System.out.println(name.substring(3, 7));
		String sub1=name.substring(0,2);
		String sub2=name.substring(2);
		String neww=sub2+sub1;
		System.out.println(neww);
		
		
		String test = "Testing";
		
		String testR=test.substring(0,2);
		System.out.println(testR);

	}
	
	


}
