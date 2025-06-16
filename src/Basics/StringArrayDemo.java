package Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String []str= {"Shubham","Minal","Pragati","Sanju","Shubham"};
//		
//		Map<String,Integer>map=new HashMap<>();
//		
//		for(String name:str) {
//			
//			map.put(name, map.getOrDefault(name, 0)+1);
//		}
//		
//		for(Map.Entry<String, Integer> entry:map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+" Occurs "+entry.getValue()+" Times");
//			}
//		}
		
		
		char ch[]= {'A','C','v','d','A','C'};
		
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		
		for(char c:ch) {
			if(Character.isUpperCase(c)) {
			map.put(c, map.getOrDefault(c, 0)+1);}
		}
		
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" Occurs "+entry.getValue()+" times");
			}
		}
		

	}

}
