package Interview_Programs;


public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Programming";
		
		int vowels=0;
		for(char c:str.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			}
		}
		System.out.println(vowels);

	}

}
