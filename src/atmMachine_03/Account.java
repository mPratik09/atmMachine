package atmMachine_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int id;
	private int pin;
	private double currentBalance;
	private double savingBalance;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat bal = new DecimalFormat("$ ###,##0.00");
	
	public int getId() {
		return id;
	}
	public int setId(int id) {
		this.id = id;
		return id;
	}
	public int getPin() {
		return pin;
	}
	public int setPin(int pin) {
		this.pin = pin;
		return pin;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public double calCurrentDeposite(double amt) {
		currentBalance = (currentBalance + amt);
		return currentBalance;
	}
	public double calCurrentWithdraw(double amt){
		currentBalance = (currentBalance - amt);
		return currentBalance;
	}
	public double calSavingDeposite(double amt) {
		savingBalance = (savingBalance + amt);
		return savingBalance;
	}
	public double calSavingWithdraw(double amt) {
		savingBalance = (savingBalance - amt);
		return savingBalance;
	}
	public void getCurrentDeposite() {
		System.out.println("Current Balance in Current Account "
				+ "is: \t" + bal.format(currentBalance));
		System.out.print("Enter amount you want to "
				+ "deposite:\t");
		double amt = input.nextDouble();
		
		if((currentBalance + amt) >= 0) {
			calCurrentDeposite(amt);
			System.out.println("New Current Account "
					+ "Balance is:\t" + bal.format(currentBalance) + "\n"
							+ "");
		}else {
			System.out.println("Never be Negative..");
		}
	}
	public void getCurrentWithdraw() {
		System.out.println("Current balance in Current Account "
				+ "is:\t" + bal.format(currentBalance));
		double amt = input.nextDouble();
		
		if((currentBalance - amt) >= 0) {
			calCurrentWithdraw(amt);
			System.out.print("New amount in Current Account "
					+ "is:\t" + bal.format(currentBalance) +" \n");
		}else {
			System.out.println("Never be negative..");
		}
	}
	public void getSavingDeposite() {
		System.out.println("Your current balance in "
				+ "Saving Account is:\t" + bal.format(savingBalance));
		System.out.print("Enter amount you want to deposite:\t");
		double amt = input.nextDouble();
		
		if((savingBalance + amt) >=0) {
			calSavingDeposite(amt);
			System.out.println("New Saving Account "
					+ "Balance is:\t" + bal.format(savingBalance) + "\n" );
		} else {
			System.out.println("Balance never be negative..");
		}
	}
	public void getSavingWithdraw() {
		System.out.println("Your current saving account "
				+ "balance is:\t" + bal.format(savingBalance));
		double amt = input.nextInt();
		if((savingBalance - amt) >= 0) {
			calSavingWithdraw(amt);
			System.out.println("New Saving Account "
					+ "Balance is:\t"  + bal.format(savingBalance));
		} else {
			System.out.println("Balance never be negative..");
		}
		System.out.println();
	}
}








