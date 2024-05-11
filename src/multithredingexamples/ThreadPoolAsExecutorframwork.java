package multithredingexamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolJob implements Runnable{
	
	 String name;
	ThreadPoolJob(String name){
		this.name=name;
	}
	

	@Override
	public void run() {
		System.out.println(name +"---job started by Thread :" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			
		}catch(InterruptedException e){}
			
		System.out.println(name +"---job completed by Thread :" + Thread.currentThread().getName());
		
	}
	
}

public class ThreadPoolAsExecutorframwork {

	public static void main(String[] args) {
		ThreadPoolJob[] jobs = {
				new ThreadPoolJob("Ravi"),
				new ThreadPoolJob("Shayam"),
				new ThreadPoolJob("DK"),
				new ThreadPoolJob("Tom"),
				new ThreadPoolJob("Shiva"),
				new ThreadPoolJob("Sam")
		};
		
		ExecutorService service = Executors.newFixedThreadPool(6);
		for(ThreadPoolJob job :jobs) {
			service.submit(job);
		}
		service.shutdown();
	}

}
