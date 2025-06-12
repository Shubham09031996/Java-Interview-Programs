package Interview_Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
		//31, 37, 41, 43, 47, 53, 59,
		//61, 67, 71, 73, 79, 83, 89, 97
		int num=53;
		int count=0;
		
		//range 1-20
		for(int i=1;i<=20;i++) {
		
		for(int j=1;j<=20;j++) {
			if(num%j==0) {
				count++;
				System.out.println("prime numbers"+j);
			}
			
		}}
		if(count==2) {
			System.out.println(num+" Is a prime number");
		}
		else {
			System.out.println(num+" Is not a prime number");
		}
		

	}

}
