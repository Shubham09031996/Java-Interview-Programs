package Interview_Programs;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int num1=0,num2=1,num=10,next=0;
      
      System.out.print(num1+" "+num2);
      for(int i=2;i<=10;i++) {
    	  
    	  next=num1+num2;
    	  System.out.print(" "+next);
    	  num1=num2;
    	  num2=next;
      }
	}

}
