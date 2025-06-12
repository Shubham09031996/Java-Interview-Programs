package Interview_Programs;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String name="ShubhamChauhan";
		
		char ch[]=name.toCharArray();
		
		for(int i=0;i<ch.length;i++){
		    if(ch[i]=='v' || ch[i]=='i'||ch[i]=='a'||ch[i]=='u'){
		        System.out.println(ch[i]+" vowels");
		    }
		}
	}

}
