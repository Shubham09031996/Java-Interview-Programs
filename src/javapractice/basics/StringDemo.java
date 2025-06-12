package javapractice.basics;

public class StringDemo {
	
	// String not allow to change og value but other side stringBuilder allows with object name
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Shubham";
		//String name="Chauhan";  //will not allow to change the og value
		String name1=name.concat("Here...");  //// we have to contact and store in another value so that our og value remains same
		System.out.println(name1);
		System.out.println(name);
		
		
		StringBuilder sb=new StringBuilder("Shubham");  ///// og value
		sb.append("Chauhan");  /////////                allow to change the og value
		
		System.out.println(sb);
		
		
	}

}
