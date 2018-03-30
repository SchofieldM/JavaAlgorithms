package main.com.algorithms.sounds;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MakeDefaultSounds {
	
	public static void beep()
	{
		Toolkit.getDefaultToolkit().beep();
	}
	
	public static void main(String args[]) throws InterruptedException {
		beep();

	}
}
