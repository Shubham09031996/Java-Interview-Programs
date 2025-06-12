package Interview_Programs;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12367;
		int rev=0,rem;
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}

		System.out.println(rev);
	}

}
