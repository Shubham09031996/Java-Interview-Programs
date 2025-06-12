package Interview_Programs;

public class BubbleSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,54,12,43};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int arr:a) {
			System.out.println(arr);
		}

	}

}
