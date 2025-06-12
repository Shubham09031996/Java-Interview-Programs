package Basics;

public class StringArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = { "shubham", "java", "gaming", "java" };
		int len = str.length;
		boolean flag = false;

		for (int i = 0; i < len; i++) {

			for (int j = i + 1; j < len; j++) {
				if (str[i] == str[j]) {
					System.out.println(str[i]);
				//	flag = true;
				}
			}
		}
		
//		if(flag==false) {
//			System.out.println("No element found");
//		}

	}

}
