package main.com.algorithms.multithreading;

public class UsingRunnable implements Runnable{

	private Thread t;
	private String threadTitle;
	   
	public UsingRunnable(String threadTitle) {
		this.threadTitle = threadTitle;
		System.out.println(threadTitle + " created");
	}
	   
	public void run() {
		System.out.println("Running " +  threadTitle);
		System.out.println("Thread " +  threadTitle + " exiting.");
   	}
	   
   public void start () {
      System.out.println("Starting " +  threadTitle );
      if (t == null) {
         t = new Thread (this, threadTitle);
         t.start ();
      }
   }


	public static void main(String args[])
	{
		UsingRunnable runnable1 = new UsingRunnable("Thread 1");
		runnable1.start();

		UsingRunnable runnable2 = new UsingRunnable("Thread 2");
		runnable2.start();
	}
}
