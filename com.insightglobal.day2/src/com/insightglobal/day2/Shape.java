package com.insightglobal.day2;

public abstract class Shape {
      int length;
      
      
      public Shape(int length) {
    	  this.length=length;
      }
      
      public abstract double calculateArea();
}


class Rectangle extends Shape {
 int height; 

 
 public Rectangle(int length, int height) {
     super(length); 
     this.height = height;
 }

 
 @Override
 public double calculateArea() {
     return length * height; 
 }
}


class Square extends Shape {

 
 public Square(int length) {
     super(length);
 }


 @Override
 public double calculateArea() {
     return length * length; 
 }
}


class Triangle extends Shape {
 int height; 

 public Triangle(int length, int height) {
     super(length); 
     this.height = height;
 }

 
 @Override
 public double calculateArea() {
     return 0.5 * length * height; 
 }
}



