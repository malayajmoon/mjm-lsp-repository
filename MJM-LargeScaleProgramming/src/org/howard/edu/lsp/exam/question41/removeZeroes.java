package org.howard.edu.lsp.exam.question41;

import java.util.ArrayList;

public class removeZeroes {

	public removeZeroes() {
		public static void main(String[] args) {

	        //creating object for RemoveZeroes class

	        RemoveZeroes rz = new RemoveZeroes();

	        //create array list

	        ArrayList<Integer> arrlist = new ArrayList<Integer>();

	        //adding elements to the array list

	        arrlist.add(0);

	        arrlist.add(2);

	        arrlist.add(3);

	        arrlist.add(1);

	        arrlist.add(5);

	        arrlist.add(0);

	        arrlist.add(0);


	        System.out.println("Initial elements in array list: ");

	        for(int i=0;i<arrlist.size();i++)

	            System.out.print(arrlist.get(i)+" ");

	        //calling removeZeroes method

	        rz.removeZeroes(arrlist);

	        //displaying elements after method calling

	        System.out.println("\n\nElements in array list after calling method : ");

	        for(int i=0;i<arrlist.size();i++)

	            System.out.print(arrlist.get(i)+" ");

	        System.out.println();

	    }
		
		{
	

	}

	

	class RemoveZeroes

	{

	    //method definition

	    public void removeZeroes(ArrayList<Integer> arrlist)

	    {

	        for(int i=0;i<arrlist.size();i++)
	        {

	            //if element is zero remove it

	            if(arrlist.get(i)==0)

	              {

	                arrlist.remove(i);

	                 i--;

	              }

	        }

	    }



	}
	

}
