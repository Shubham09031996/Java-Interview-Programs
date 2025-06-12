package Interview_Programs;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=45346,rem,sum=0;
		
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}
