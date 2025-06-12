package Basics;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12321;
		int og=num;
		int rev=0,rem;
		
		
		while(num !=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
	//	System.out.println(num);
		System.out.println(rev);
		if(og==rev) {
			System.out.println(rev+" Number is palindrom");
		}
		else {
			System.out.println("Number is not palindrom");
		}
		
	}

}
