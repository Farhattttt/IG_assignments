package com.insight.ThreadTask;

public class ManagerThread extends Thread {
    private ConferenceRoomBookingJob bookingJob;
    
    public ManagerThread(ConferenceRoomBookingJob bookingJob, String name) {
    	super(name);
    	this.bookingJob=bookingJob;
    }
    
    @Override
    
    public void run() {
    	try {
    		if(bookingJob.checkAvailability()) {
    			bookingJob.bookRoom();
    			
    			System.out.println(Thread.currentThread().getName() + " is conducting a meeting.");
    			Thread.sleep(2000);
    			
    			bookingJob.releaseRoom();
    		} else {
    			 System.out.println(Thread.currentThread().getName() + " found the room unavailable and will try later.");
    		}
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
    }
}
