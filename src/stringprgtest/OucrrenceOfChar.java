package stringprgtest;

import java.util.HashMap;
import java.util.Map;

public class OucrrenceOfChar {
// find the occurrence each of Char in St
	public static void main(String[] args) {
		String s= "this is java program";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] ch = s.toCharArray();
		for(char s1:ch) {
			//if you want to remove blank space use this if(!String.valueOf(s1).isBlank())
			if(!String.valueOf(s1).isBlank()) {
			if(!map.containsKey(s1)) {
				map.put(s1, 1);
			}else {
		      int a= map.get(s1);
		        map.put(s1,a+1);
			}
		
		}
		}
		System.out.println(map);

	}

}
