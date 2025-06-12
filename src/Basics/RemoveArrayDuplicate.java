package Basics;

import java.util.Arrays;

public class RemoveArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,2,5,7,9,4,5,4};
		Arrays.sort(arr);
		int j=1;
		int len=arr.length;
		System.out.println(len);
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
			}
		}
		System.out.println();
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]);
		}
	}

}
