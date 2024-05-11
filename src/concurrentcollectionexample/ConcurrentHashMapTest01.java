package concurrentcollectionexample;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest01  {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap m = new ConcurrentHashMap();
		
		m.put(101, "shiva");
		m.put(101, "Ravi");
		System.out.println(m);// output ={101=Ravi}
		m.putIfAbsent(101, "Durga");
		System.out.println(m);// output = {101=Ravi}
		m.putIfAbsent(102, "deepak");
		System.out.println(m);// output = {101=Ravi, 102=deepak}
				
		
	}

}
