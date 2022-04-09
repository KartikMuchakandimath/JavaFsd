package concurrancy;

public class threadDemo2 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()+" Main thread started...");
	Thread t1 = new Thread(new AdCampaign());
	Thread t2 = new Thread(new PollResearch());
	t1.setName("AdCampaign");
	t2.setName("PollResearch");
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
	try {
		t2.join();
		//Thread.sleep(1000);
	}
	catch (Exception e) {
		
	}
	
	System.out.println(Thread.currentThread().getName()+" Main thread Ended...");
	
}
}

class AdCampaign implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
}
class PollResearch implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
	
}