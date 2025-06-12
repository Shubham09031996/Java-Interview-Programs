package Interview_Programs;

public class PalindromNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=121;
		int og=num;
		int rev=0,rem;
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}

		if(og==rev) {
			System.out.println(og+" num is palindrom");
		}
		else {
			System.out.println(og+" num is not palindrom");
		}

	}

}
