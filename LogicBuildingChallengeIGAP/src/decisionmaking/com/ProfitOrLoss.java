package decisionmaking.com;

import java.util.Scanner;

public class ProfitOrLoss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float saleAmount, unitPrice, amount; 
		
		System.out.print(" Please Enter the Actual Product Cost : ");
		unitPrice = sc.nextFloat();	
		
		System.out.print(" Please Enter the Selling Price (Market Price) : ");
		saleAmount = sc.nextFloat();
		
		if(saleAmount > unitPrice )
		{
			amount = saleAmount - unitPrice;
			System.out.println(" Profit Amount =  " + amount);
		}
		else if(unitPrice > saleAmount)
		{
			amount = unitPrice - saleAmount;
			System.out.println(" Loss Amount =  " + amount);
		}
		else
		{
			System.out.println(" No Profit No Loss ");
		}
		sc.close();
	}

}
