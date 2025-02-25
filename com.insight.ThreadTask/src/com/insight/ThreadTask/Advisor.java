package com.insight.ThreadTask;

import java.util.Random;

public class Advisor {

	public static void main(String[] args) {
		String[] advices = {
				 "Never begin to stop and never stop to begin.",
		            "Only destination isn’t important, one should enjoy the journey.",
		            "Impossible itself says 'I am possible'.",
		            "The best way to predict the future is to create it.",
		            "Don’t wait for opportunity. Create it.",
		            "Success is not the key to happiness. Happiness is the key to success."
		};
		
		 Random random = new Random();
	        int randomIndex = random.nextInt(advices.length);
	        
	       
	        System.out.println("Advice for you: " + advices[randomIndex]);
	}
}
