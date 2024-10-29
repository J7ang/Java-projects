//code for the accounts and the user interface and interactions

package Bank;

import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
	
	static String name = "";
	static double balance = 0;
	static boolean x = true;
	
	public Bank(int accountNum, int pin) {
		
		if (accountNum == 1001 && pin == 1234) {
			x = true;
			name = "John Doe";
			balance = 500.00;
		}
		
		else if (accountNum == 1002 && pin == 2345) {
			x = true;
			name = "Jane Smith";
			balance = 1200.00;
		}
		
		else if (accountNum == 1003 && pin == 3456) {
			x = true;
			name = "Alice Johnson";
			balance = 850.00;
		}
		
		else {
			System.out.println("invalid account number or pin, try again");
			x = false;
		}
	}
	
	
	
	public Bank(double balance) {
		Scanner scan = new Scanner(System.in);
		NumberFormat dollar = NumberFormat.getCurrencyInstance();
		
		BankAccount account = new BankAccount(balance);
		
		int choice;
		
		do {
			System.out.println("Bank UI:"
					+ "\n1. deposit"
					+ "\n2. withdraw"
					+ "\n3. check balance"
					+ "\n4. exit");
			
			System.out.print("> ");
			choice = scan.nextInt();
			
			
			if (choice == 1) {
				System.out.print("deposit amount: ");
				double deposit = scan.nextDouble();
				account.deposit(deposit);
				
				
			} else if (choice == 2) {
				System.out.print("withdraw amount: ");
				double withdraw = scan.nextDouble();
				account.withdraw(withdraw);
				
				
			} else if (choice == 3) {
				System.out.print("Balance: " + dollar.format(account.showbalance()));
				
				
			} else if (choice == 4) {
				System.out.println("Exiting");
				
			}

		} while (choice != 4);
		
		scan.close();
		
	}
}

		
