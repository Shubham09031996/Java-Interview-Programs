package Interview_Programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,5,15,20,42};
		
		int start=0;
		int end=a.length-1;
		
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		for(int num:a) {
			System.out.println(num);
		}

	}

}
