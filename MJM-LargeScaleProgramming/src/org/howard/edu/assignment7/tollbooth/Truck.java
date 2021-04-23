package org.howard.edu.assignment7.tollbooth;

public interface Truck {

	public int getAxles();
	public int getWeight();

}

class tollNumber implements TollBooth { 
tollNumber()
   {
truckNum = 0;
receiptCount = 0;
}
public void calculateToll(Truck truck) // get each truck info 
   {
int axles = truck.getAxles();
int Weight = truck.getWeight();
int tollTotal = (5 * axles) + ((Weight/1000) * 10);
System.out.println("# of axles: "+ axles);
System.out.println("Weight: "+ Weight + "lbs" ); //2000 lbs per ton 
truckNum = truckNum + 1;
receiptCount = receiptCount + tollTotal;
System.out.print("Toll Total For Truck "+ truckNum + " : ");
System.out.println(tollTotal);
}
public void DisplayData() //display data for each truck 
   {
System.out.println("# Of Trucks Pass The TOLL: " + truckNum);
System.out.println("Total amount of Receipts when "+truckNum + " Truck Passes The Toll :" + receiptCount);
}
int receiptCount;
int truckNum;
   }
class truckInfo extends tollNumber implements Truck { //stores truck info 
truckInfo(int axles, int Weight)
   {
this.axles = axles;
this.Weight = Weight;
}
public int getAxles()
   {
       return axles;
   }
public int getWeight()
   {
       return Weight;
   }
int axles;
int Weight;
}