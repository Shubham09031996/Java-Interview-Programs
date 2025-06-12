package Interview_Programs;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {2,4,5,6,7,8,9};
		int sum1=0,sum2=0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		
		for(int i=2;i<=9;i++) {
			sum2=sum2+i;
		}
		
		System.out.println(sum2);
		
		int diff=sum2-sum1;
		System.out.println("Difference of array in "+diff);
	}

}
