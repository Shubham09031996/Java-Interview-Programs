package Interview_Programs;

public class StringCharDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";
		StringBuilder doubl=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			doubl=doubl.append(ch).append(ch).append(ch);
		}
		System.out.println(doubl);
	}

}
