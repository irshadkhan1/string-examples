package concurrentcollectionexample;

import java.util.*;

public class ConcurrentModificationExceptionDemonstrate extends Thread {
	
	static ArrayList l = new ArrayList();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		System.out.println("Child thread updationg List");
		l.add("D");
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		l.add("A");
		l.add("B");
		l.add("C");
		ConcurrentModificationExceptionDemonstrate t = new ConcurrentModificationExceptionDemonstrate();
		t.start();
		Iterator itr =  l.iterator();
		while(itr.hasNext()) {
			String s1 = (String)itr.next();
			System.out.println("Main Thread iterating List :" +s1);
			Thread.sleep(3000);
			System.out.println(s1);
		}
		
	}

}
