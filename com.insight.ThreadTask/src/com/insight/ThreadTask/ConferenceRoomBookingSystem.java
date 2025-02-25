package com.insight.ThreadTask;

public class ConferenceRoomBookingSystem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ConferenceRoomBookingJob bookingJob = new ConferenceRoomBookingJob();

	       
	        ManagerThread manager1 = new ManagerThread(bookingJob, "Manager 1");
	        ManagerThread manager2 = new ManagerThread(bookingJob, "Manager 2");

	       
	        manager1.start();
	        manager2.start();

	       
	        manager1.join();
	        manager2.join();

	        System.out.println("Both managers have finished their meetings.");

	}

}
