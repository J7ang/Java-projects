
package Bank;
import java.text.NumberFormat;

public class BankAccount {
	
	NumberFormat dollar = NumberFormat.getCurrencyInstance();

	private double balance;
	
	public BankAccount(double money) {
		balance = money;
	}
	
    
    public void deposit(double amount) {
    	if (amount > 0) {
    		balance += amount;
    		System.out.println("new balance: " + dollar.format(balance));
    		
    	}else {
    		System.out.println("deposit must be greater than 0");
    	}
    }
    	
    public void withdraw(double amount) {
    	if (amount > 0) {
    			
    		if (amount <= balance) {
    			balance -= amount;
    	    	System.out.println("new balance: " + dollar.format(balance));

    		} else {
    	    	System.out.println("withdraw cannot e more than balance");

    		}
    			
    	} else {
        	System.out.println("withdraw must be greater than 0");
        		
    	}
    		
    }
    	
    
    public double showbalance() {
    	return balance;
    }
    
}