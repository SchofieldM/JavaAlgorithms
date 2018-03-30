package main.com.algorithms.multithreading;

import java.util.Timer;
import java.util.TimerTask;

public class UsingTimerTask {

	public UsingTimerTask(String msg, int startTime, int stepTime)
	{
		new Timer().schedule(new TimerTask() { 
	      @Override 
	      public void run() { 
	    	  System.out.println(msg);
	      } 
	    }, startTime, stepTime); 
	}
	
	public static void main(String[] args)
	{
		new UsingTimerTask("Thread1", 0, 5000);
		new UsingTimerTask("Thread2", 3000, 100);
	}
	
}
