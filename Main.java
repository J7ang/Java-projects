//////////////////////////
//Name: Banking Application
//Dev: Junhan Yang
//Date: 10/28/2024
//Middlesex college
//////////////////////////
//the main code that runs the application

package Bank;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat dollar = NumberFormat.getCurrencyInstance();
		
		int y = 0;
		
		do {
			System.out.print("Welcome to online Banking, please enter your account number and pin."
					+ "\naccount number: ");
			int accountNum = scan.nextInt();
		
			System.out.print("pin: ");
			int pin = scan.nextInt();
		
			new Bank(accountNum, pin);
		
		
			if (Bank.x == true) {
				System.out.println(Bank.name);
				System.out.println(dollar.format(Bank.balance));
		
		
				new Bank(Bank.balance);
		
				System.out.println("exited");
				break;
			}
			
		} while (y == 0);
		
		scan.close();
		
	}
	
}
