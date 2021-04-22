package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animal {
	   public Goose() {
	   }


	   @Override
	   public void move() {
	       System.out.println("This goose moves forward");
	      
	   }
	   
	   @Override 
	   public void speak() {
	       System.out.println("This goose speaks");
	   }

	   @Override 
	   public void fly() {
	       System.out.println(this.getClass().getSimpleName()+" flying with wings");
	   }
	}



