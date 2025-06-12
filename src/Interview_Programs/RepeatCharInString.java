package Interview_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name="Manali";
//		
//		Map<Character,Integer>map=new HashMap<Character,Integer>();
//		for(int i=0;i<name.length();i++) {
//			char c=name.charAt(i);
//			map.put(c, map.getOrDefault(c, 0)+1);
//		}
//		for(char c:map.keySet()) {
//			if(map.get(c)>1) {
//				System.out.println(c+ " repeted "+ map.get(c)+ " times");
//			}
//		}
		
		
	
		String name ="Java is my fav lang";
		name=name.replace(" ", "");
		char ch[]=name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		
		for(char cc:map.keySet()) {
			if(map.get(cc)>1) {
				System.out.println(cc+" is repeted "+map.get(cc)+" times");
			}
			
		}
		
		
//		int num[]= {1,1,2,2,3,4,5,5,6,6,7,7};
//		Map<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<num.length;i++) {
//			int p=num[i];
//			map.put(p, map.getOrDefault(p, 0)+1);
//		}
//		
//		List<Integer> numbers=new ArrayList<>();
//		for(int value:map.keySet()) {
//			if(map.get(value)==1) {
//				numbers.add(value);
//			}
//		}
//		System.out.println(numbers);
		
		
		
	}

}
