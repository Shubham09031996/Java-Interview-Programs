package Basics;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name="ShubhamChauhan";
	  	int count=0;
		char [] ch=name.toCharArray();		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate ");
					System.out.println(ch[j]);
					count++;
				}
			}
		}
		System.out.println("Duplicate character count "+count);
	}

}
