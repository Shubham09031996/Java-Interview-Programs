package Interview_Programs;

public class TotoalNumberInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=2356817,count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
