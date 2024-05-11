package concurrentcollectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest extends Thread{

static ConcurrentHashMap m = new ConcurrentHashMap();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println("Child thread updationg List");
		m.replace(103,"C" ,"F");
		m.putIfAbsent(105, "A");
	}
	public static void main(String[] args) throws InterruptedException {
	
		m.put(101,"A");
		m.put(102, "B");
		m.put(103,"C");
		m.putIfAbsent(104, "D");
		m.remove(101,"A");
		ConcurrentHashMapTest t =new ConcurrentHashMapTest();
		t.start();
		Set s = m.keySet();
		Iterator itr =  s.iterator();
		while(itr.hasNext()) {
			Integer s1 = (Integer)itr.next();
			m.putIfAbsent(106, "G");
			System.out.println("Main Thread iterating List :" +s1 + " == "+m.get(s1));
			Thread.sleep(3000);
			
		}
		System.out.println(m);
	}

}
