package com.insight.ThreadTask;

 public class ConferenceRoomBookingJob {
    private boolean isRoomAvailable = true;
    
    
    public synchronized boolean checkAvailability() {
    	return isRoomAvailable;
    }
    
    public synchronized void bookRoom() {
    	if(isRoomAvailable) {
    		System.out.println(Thread.currentThread().getName() + " has booked the room.");
    		isRoomAvailable=false;
    	}
    }
    
    public synchronized void releaseRoom() {
    	System.out.println(Thread.currentThread().getName() + "has finished the meeting and released the room.");
    	isRoomAvailable=true;
    }
}
