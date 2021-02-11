package org.howard.edu.lsp.assignment2.Combination;

public class Combination {
	public boolean arrElememts( int arrValue [], int arrLength, int targetSum)
	{
		int num1;
		int num2;
		
		num1 = 0; //starting index 
		num2 = arrLength - 1; //last index of array 
		
		while(num1 < num2)
		{ 
			if (arrValue[num1] + arrValue[num2] == targetSum) //find values equal to target sum
				return true;
			
			else if (arrValue[num1] + arrValue[num2] < targetSum) //keeps searching array 
				num1 ++;
			
			else if (arrValue[num1] + arrValue[num2] > targetSum) //keeps searching array 
				num2 --; 
	 } 
	return false; 
	}
	
} 

//Malaya Moon 