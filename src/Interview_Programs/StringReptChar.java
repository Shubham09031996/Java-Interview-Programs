package Interview_Programs;

public class StringReptChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name ="Shubhamchauhan";
		
		char a[]=name.toCharArray();
		boolean b[]=new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=0;
				
				for(int j=0;j<b.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if(count>1) {
					System.out.println(a[i]+ " "+count);
				}
			}
		}

	}

}
