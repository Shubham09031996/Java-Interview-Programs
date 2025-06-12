package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class CountTheRepeatCharInString {

    public static void main(String[] args) {
    	
    	String name="Manali";
    	
    	Map<Character,Integer> map = new HashMap<>();
    	
    	for(int i=0;i<name.length();i++) {
    		
    		char c=name.charAt(i);
    		map.put(c, map.getOrDefault(c, 0)+1);
    	}
    	for(char ch:map.keySet()) {
    		if(map.get(ch)>=1) {
    			System.out.println(ch +" occurs"+map.get(ch)+" times");
    		}
    	}
    	
    }
}
