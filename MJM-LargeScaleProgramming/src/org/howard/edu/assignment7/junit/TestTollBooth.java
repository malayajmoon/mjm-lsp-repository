package org.howard.edu.assignment7.junit;

public class TestTollBooth {

	 
	public static void main(String [] args)
	   {
	tollNumber booth = new tollNumber();
	truckInfo Ford = new truckInfo(5,16000);
	truckInfo Nissan = new truckInfo(2,8000);
	truckInfo Daewoo = new truckInfo(6,12000);
	System.out.println("FORD TRUCK:");
	booth.calculateToll(Ford);
	booth.DisplayData();
	System.out.println("*************************************************************");
	System.out.println("NISSAN TRUCK:");
	booth.calculateToll(Nissan);
	booth.DisplayData();
	System.out.println("*************************************************************");
	System.out.println("DAEWOO TRUCK:");
	booth.calculateToll(Daewoo);
	booth.DisplayData();
	}
}