package com.insight.ThreadTask;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock implements Runnable {
	 @Override
	    public void run() {
	        while (true) {
	            try {
	                // Get the current system time
	                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	                String time = sdf.format(new Date());
	                
	                // Clear the console (this is optional, just to refresh the time)
	                System.out.print("\033[H\033[2J");
	                System.out.flush();
	                
	                // Display the current time
	                System.out.println("Digital Clock: " + time);
	                
	                // Delay of 500 milliseconds (0.5 seconds)
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                System.out.println("Clock interrupted");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        // Create a new thread for the Digital Clock
	        DigitalClock clock = new DigitalClock();
	        Thread clockThread = new Thread(clock);
	        
	        clockThread.start();
	    }
	}

