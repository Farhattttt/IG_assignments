package com.insightglobal.day2;

 public class Game {
	
	public void displayInfo() {
		System.out.println("This is a generic game.");
		
	}
}
 
class Cricket extends Game {
	@Override
	
	public void displayInfo() {
		System.out.println("Cricket is a bat-and-ball game played between two teams of eleven players.");
	}
}

class Football extends Game {
	@Override
	
	public void displayInfo() {
		 System.out.println("Football (Soccer) is a team sport played with a spherical ball between two teams of eleven players.");
	}
}

class Tennis extends Game {
    @Override
    public void displayInfo() {
        System.out.println("Tennis: A racket sport where players compete to hit a ball over a net into the opponent's court.");
    }
}






