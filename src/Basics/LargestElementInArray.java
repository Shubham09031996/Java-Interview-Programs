package Basics;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,6,8,4,9,0};
		int largest=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[0]) {
				largest=a[i];
			}
		}
		System.out.println(largest);

	
	}

}
