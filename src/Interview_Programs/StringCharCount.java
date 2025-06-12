package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="ShubhamChauhan";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char ch:map.keySet()) {
			if(map.get(ch)>=1) {
				System.out.println(ch + " appears " + map.get(ch) + " times.");
			}
		}

	}

}
