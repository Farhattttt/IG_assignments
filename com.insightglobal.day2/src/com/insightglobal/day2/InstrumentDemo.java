package com.insightglobal.day2;

public class InstrumentDemo {
	 public static void main(String[] args) {
	     // Create an array of Instruments
	     Instrument[] instruments = new Instrument[10];

	     
	     instruments[0] = new Piano();
	     instruments[1] = new Flute();
	     instruments[2] = new Guitar();
	     instruments[3] = new Piano();
	     instruments[4] = new Flute();
	     instruments[5] = new Guitar();
	     instruments[6] = new Piano();
	     instruments[7] = new Flute();
	     instruments[8] = new Guitar();
	     instruments[9] = new Piano();

	    
	     for (int i = 0; i < instruments.length; i++) {
	         System.out.print("Instrument at index " + i + ": ");
	         instruments[i].play(); 
	     }

	     
	     System.out.println("\nUsing instanceof to check object types:");
	     for (int i = 0; i < instruments.length; i++) {
	         if (instruments[i] instanceof Piano) {
	             System.out.println("Index " + i + " contains a Piano.");
	         } else if (instruments[i] instanceof Flute) {
	             System.out.println("Index " + i + " contains a Flute.");
	         } else if (instruments[i] instanceof Guitar) {
	             System.out.println("Index " + i + " contains a Guitar.");
	         }
	     }
	 }
	}

