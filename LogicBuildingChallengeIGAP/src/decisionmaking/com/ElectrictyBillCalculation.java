package decisionmaking.com;

import java.util.Scanner;

public class ElectrictyBillCalculation {
	int units;
	double bill;
	
	public void printUnits() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of units consumed: ");
	units=sc.nextInt();
	
	}
	public void calculateElecrictyBill() {
		if(units <= 100) {  // When condition is True when we go for this loop
			bill = 2*units;
		}
		else if(units > 100 && units <= 300) {     // when first condition is false then we go for on this condition 
			bill = 2*100 + (units-100)*3;
		}
		else if(units > 300) {  // above 300 units  // when two condition is false then we go for this condition 
			bill = 2 * 100 + 3*200 + (units-300)*5;
			//bill = bill+2.5*bill/100;  //  2.5%  is consider is a GST and print with GST Tax
		}
		bill = bill+2.5*bill/100;  
	}
	public void printElectrictyBillFinalAmount() {
 		System.out.println("Bill Amount: " + bill);
	}

	public static void main(String[]args) {
		ElectrictyBillCalculation electricBill = new ElectrictyBillCalculation();
		electricBill.printUnits();
		electricBill.calculateElecrictyBill();
		electricBill.printElectrictyBillFinalAmount();
		
	}
	
}
