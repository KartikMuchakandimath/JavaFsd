package concurrancy;

public class Threaddemo {
public static void main(String[] args) {
	
	Task task = new Task();
	Thread thread =new Thread(task);
	thread.setName("A1");
	thread.start();
	
	
	
	// try by sleeping main thread for some time 
	// now Task func thread will run first
	try {
		Thread.sleep(2000);
	}
	catch (Exception e) {
		e.setStackTrace(null);
	}
	somefuccall();
	//main will execute first bcz main itself is called as main thread
	System.out.println("inside main method...");
}

private static void somefuccall() {
	System.out.println("some function is called..");
	
}
}
class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside run method in task....");
		go();
	}
	private void go() {
		System.out.println(Thread.currentThread().getName() +  ": inside task.go method...");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		more();
	}
	
	private void more() {
		System.out.println(Thread.currentThread().getName() +  ": inside task.more method...");
	}
}
	