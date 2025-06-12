package Interview_Programs;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="ShubhamChauhan";
		char [] ch=name.toCharArray();
		
		boolean []b=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			if(b[i]==false) {
				int count =0;
				
				for(int j=0;j<b.length;j++) {
					
					if(ch[i]==ch[j]) {
						count++;
						b[j]=true;
					}
				}
				
				if(count>=1) {
					System.out.println(ch[i]+" "+count);
				}
			}
			
		}

	}

}
