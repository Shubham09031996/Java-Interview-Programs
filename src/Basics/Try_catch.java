package Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Try_catch {
	

	public static int[] a;
	private static int num=50,value;
	
	
	public void method() throws IOException {
		FileInputStream ip=new FileInputStream("./src/test/resource/config/config.properties");
	}
	public static void main(String[] args) throws Exception {

		//Arithmetic exception	
		try {
			value=num/0;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("I am Arithmatic exception");
		}

		//Null pointer
		try {
			String s=null;
			System.out.println(s.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am from Null pointer exception");
		}

		//Array index out of bound exception
		try {
			a=new int[6];
			a[6]=a[10];
			System.out.println(a[6]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am from Array index out of bound");

		}	
		
	}

}
