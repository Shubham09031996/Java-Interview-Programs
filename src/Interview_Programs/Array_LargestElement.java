package Interview_Programs;

public class Array_LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[]= {6,2,7,9,1,0,12};
//		int largest=Integer.MIN_VALUE;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>largest) {
//				largest=a[i];
//			}
//			
//		}
//		System.out.println(largest);
		
		
		int a[]= {10,7,4,76,12};
		 int largest=Integer.MIN_VALUE;
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]>largest) {
				 largest=a[i];
			 }
		 }
		 System.out.println(largest);

	}

}
