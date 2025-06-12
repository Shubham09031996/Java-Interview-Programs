package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="ShubhamChauhan";
		
		Map<Character,Integer>count=new HashMap<>();
		
		for(int i =0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		
		for(char c:count.keySet()) {
			if(count.get(c)>1) {
				System.out.println("Character "+c+ " is occuring "+count.get(c));
			}
		}
		

	}

}
