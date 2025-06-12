package Basics;

public class ArrayPractice {

	public static void main(String[] args) {
//		int array[]=new int[3];
//		array[0]=2;
//		array[1]=6;
//		array[2]=9;
//		//System.out.println(array);
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]);
//		}
//		for(int num:array) {
//			System.out.print(" "+num);
//		}
		
	//	WAP sum of numbers which is divisible by 3
		
//		int a[]= {5,7,9,12,4,7,9,21,27,3};
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%3==0) {
//				sum=sum+a[i];
//			}
//		}
//		System.out.println(sum);
		
		
		/// WAP to largest element in array
//		int a[]= {5,7,9,12,4,7,9,21,27,3,78};
//		int largest=Integer.MIN_VALUE;
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>largest) {
//				largest=a[i];
//			}
//		}
//		System.out.println(largest);
		
		
		
		//WAP to smallest element in array
//		int a[]= {5,7,9,12,4,7,9,21,27,3,78};
//		
//		int smallest=Integer.MAX_VALUE;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<smallest) {
//				smallest=a[i];
//			}
//		}
//		System.out.println(smallest);
		
		//WAP second largest number
//		
//		int a[]= {5,7,9,12,4,7,9,21,27,3,78,77};
//		int largest=Integer.MIN_VALUE;
//		int secoondLargest=Integer.MIN_VALUE;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]>largest) {
//				secoondLargest=largest;
//				largest=a[i];
//			}
//			else if(a[i]>secoondLargest) {
//				secoondLargest=a[i];
//			}
//		}
//		System.out.println(secoondLargest);

		
	//WAP to bubble sort
//		int a[]= {5,7,9,12,4,7,9,21,27,3,78,77};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				//System.out.println(a[i]);
//			}
//			System.out.print(" "+a[i]);
//		}
		
		
		
//		char a[]= {'A','Z','P','M','T'};
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//				//System.out.println(a[i]);
//			}
//			System.out.print(" "+a[i]);
//		}
	
		
		//WAP for a second smallest element
		
//		int a[]= {3,8,9,2,45,6,1};
//		
//		int small=Integer.MAX_VALUE;
//		int secondSmall=Integer.MAX_VALUE;
//		
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]<small) {
//				secondSmall=small;
//				small=a[i];
//			}
//			else if(a[i]<secondSmall) {
//				secondSmall=a[i];
//			}
//		}
//		System.out.println(secondSmall);
		
		
		//WAP for duplicate array
		
		int a[]= {1,3,8,9,2,45,6,1,2};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" This is a duplicate num ");
					
				}
			}
		}
		
		
		
		
		
		
		
	}
}
