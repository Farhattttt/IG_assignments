package com.insightglobal.day2;

class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Shape[] shapes = new Shape[5];
		  
		  shapes[0] = new Rectangle(10, 5);  
	        shapes[1] = new Square(4);         
	        shapes[2] = new Triangle(6, 3);    
	        shapes[3] = new Rectangle(12, 8);  
	        shapes[4] = new Square(7);         

	      
	        for (Shape shape : shapes) {
	            System.out.println("Area: " + shape.calculateArea());
	        }
	}

}
