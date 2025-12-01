package banking.com;

import java.util.Scanner;

public class BankingManagementSystem {
	
	public static void main(String[] args) {
		
		double bal = 2000;
		int pwd;
		double money;
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1. Deposite Cash:");
		System.out.println("2. Withdraw cash:");
		System.out.println("3. Check balance:");
		System.out.println("0. Exit:");
		System.out.println("Enter your choice: ");
		
		choice=sc.nextInt();
		
		switch(choice) {
		
			case 1: System.out.println("Enter Deposite Amount: ");
					money=sc.nextInt();
					System.out.print("Enter Deposite Passward: ");
					pwd=sc.nextInt();
					
						if(pwd==123) {
							
							bal=bal+money;                 // show total balance
							System.out.println("Deposit Money: " + money);
							//System.out.println("After Deposite Money Check Balance: " + bal);
						}
						else {
							System.out.println("Incorrect passward...");
							break;
						}	
			
			case 2:
					System.out.println("Enter Withdrow Amount: ");
					money=sc.nextDouble();
					
					System.out.print("Enter Withdrow Passward: ");
					pwd=sc.nextInt();
					if(pwd==123) {
						if(money <= bal) {     // if your account don't have money so u can't withdraw cash
							
							bal=bal-money;      // to check after withdraw money
							System.out.println("Withdrow money: " + money);
							System.out.println("After Withdraw Money Check balance: " + bal);
						}
						else {
							System.out.println("Insufficient balance!");
						}
						
					}
					
					else {
						System.out.println("Incorrect Passward...");
					}
				
					
			case 3:
					System.out.print("Enter Total Bank Balance Passward: ");
					Scanner sc1=new Scanner(System.in);
					pwd=sc1.nextInt();
						if(pwd==123) {
							System.out.println("Total Bank Balance: " + bal);
						}
						else {
							System.out.println("Incorrect Passward...");
						}
			
			}
		sc.close();
	}

}
