package Interview_Programs;

public class ArraySecondLargest {

	public static void main(String[] args) {
	

	int a[]= {5,1,34,22,13,5,43,13,45};
	int largest=Integer.MIN_VALUE;
	int second=Integer.MIN_VALUE;
	
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>largest) {
			second=largest;
			largest=a[i];
			}
		else if(a[i]>second&&a[i]!=largest) {
			second=a[i];
		}
		
		System.out.println(second);
	}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
