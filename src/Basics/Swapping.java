package Basics;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Before swapping "+"a:"+a+" "+"b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping "+"a:"+a+" "+"b:"+b);
	}

}
