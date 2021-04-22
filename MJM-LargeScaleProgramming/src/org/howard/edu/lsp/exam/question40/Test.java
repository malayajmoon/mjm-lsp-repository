package org.howard.edu.lsp.exam.question40;

public class Test {

	public static void main(String[] args) {
	      
	       Animal goose = new Goose();
	       Animal tiger = new Tiger();
	       Flying flyingGoose = new Goose();
	       Flying airplane = new Airplane();
	      
	       goose.move();
	       goose.speak();
	       tiger.move();
	       tiger.speak();
	       flyingGoose.fly();
	       airplane.fly();
	   }

}
