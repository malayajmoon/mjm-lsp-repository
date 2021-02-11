package org.howard.edu.lsp.assignment2.Test;

import org.howard.edu.lsp.assignment2.Combination.Combination; //import class from other package 

public class Test {
	//drive code 
	public static void main(String[] args) {
		
		Combination Combination = new Combination(); //clarifies the class from other package 
		
		
		
		int valueArr [] = {1, 3, 4, 5, 6, 8}; //array of values
		int targetSum = 9; //
		int arrLength = valueArr.length; //find length of array 
		
		if (arrElememts( valueArr, arrLength, targetSum))
			System.out.println("[" + valueArr[num1] + "," + valueArr[num2] + "]"); //outputs values that are equal to the target sum
		else 
			System.out.println("Array does not have any values that add up to the target sum"); //outputs if no values add up to equal target sum 
		
		
	}
}

//Malaya Moon  
//Code will run into error as I did not determine how to import other class and boolean object and other variables properly 
