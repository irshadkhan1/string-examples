package stringprgtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateElement {

	public static void main(String[] args) {
	 
		//brute force
		//HashSet
		//HashMap<k,v>
		//Stream
		
		String dupl[] = {"Amazon","GCP","Azure","Amazon","Ali Baba","SauceLabs","Azure","GCP"};
		System.out.println("----brute force-----");
		for(int i=0; i<dupl.length;i++) {
			for(int j=i+1; j<dupl.length; j++) {
				if(dupl[i]==dupl[j]) {
					System.out.println(dupl[i] );
				}
			}
		}
		
		//=====================================================
		System.out.println("----HashSet-----");
		Set<String> data = new HashSet<String>();
		for(String e:dupl) {
			if(data.add(e)==false) {
				System.out.println(e);
			}
		}
		//==========================================================
		System.out.println("----HashMap-----");
		Map<String,Integer> map =new HashMap<String,Integer>();
		for (String e1:dupl) {
			Integer count = map.get(e1);
			if(count==null) {
				map.put(e1, 1);
			}else {
				map.put(e1, ++count);
			}
		}
			// print all the duplicates using Entry Set
			Set<Entry<String,Integer>> entrySet = map.entrySet();
			for(Entry<String,Integer> entry:entrySet) {
				if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+entry.getValue());
				}
			}
		//=============================================================
			System.out.println("----Streams-----");
			Set<String> dataSet = new HashSet<String>();
	Set<String>	dupSet	= Arrays.asList(dupl).stream()
			                 .filter(e1 ->!dataSet.add(e1))
			                    .collect(Collectors.toSet());
	        System.out.println(dupSet);
	}

}
