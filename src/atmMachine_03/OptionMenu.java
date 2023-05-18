package atmMachine_03;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class OptionMenu extends Account {
	int select;
	Scanner menu = new Scanner(System.in);
	DecimalFormat bal = new DecimalFormat("$ ###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException {
		int x =1;
		do {
			try {
				data.put(12, 12);
				data.put(21, 21);
				System.out.println("\t\t\tatmMachime_03");
				System.out.print("Enter Id:\t\t");
				setId(menu.nextInt());
				System.out.print("Enter Pin:\t\t");
				setPin(menu.nextInt());
			}catch(Exception e) {
				System.out.println("\t\tInvald Input");
				x = 2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
		//		if(entry.getKey() == getId() && entry.getValue() == getPin()) {
					System.out.println("Matched..\n");
					getAccountType();
	//			}
			}
		} while(x == 1);
	}
	public void getAccountType() {
		System.out.println("Select Account Type..");
		System.out.println("\t\t0. Exit");
		System.out.println("\t\t1. Current Account");
		System.out.println("\t\t2. Saving Account\n");
		System.out.println("Enter your choice:\t\t");
		
		select = menu.nextInt();
		switch (select) {
		case 0:
			System.out.println("Thank You.. Vsit Again..");
			break ;
		case 1:
			getCurrent();
			break;
		case 2:
			getSaving();
			break;
		default:
			System.out.println("\t\tInavalid Input..");
			getAccountType();
		}
	}
	public void getCurrent() {
		System.out.println("\t\t\tCURRENT ACCOUNT\n");
		System.out.println("\t\t0. Exit");
		System.out.println("\t\t1. Show Balance");
		System.out.println("\t\t2. Deposite");
		System.out.println("\t\t3. Withdraw");
		System.out.println("\t\t4. Back");
		System.out.println("Enter your choice..");
		
		select = menu.nextInt();
		switch (select) {
		case 0:
			getAccountType();
			break;
		case 1:
			System.out.println("Current Balance in Current Account "
					+ "is:\t" + bal.format(getCurrentBalance()) + "\n");
			getCurrent();
			break;
		case 2:
			getCurrentDeposite();
			getCurrent();
			break;
		case 3:
			getCurrentWithdraw();
			getCurrent();
			break;
		default:
			System.out.println("\t\tInvalid Input");
		}
	}
	
	public void getSaving() {
		System.out.println("\t\t\tSAVING ACCOUNT");
		System.out.println("\t\t0. Exit");
		System.out.println("\t\t1. Show Balance");
		System.out.println("\t\t2. Deposite");
		System.out.println("\t\t3. Withdraw");
		System.out.println("\t\t4. Back");
		System.out.println("Enter Your Choice..");
		
		select = menu.nextInt();
		
		switch (select) {
		case 0:
			System.out.println("TY VA..");
			break;
		case 1:
			System.out.println("Saving "
					+ "Account Balance is:\t\t" + bal.format(getSavingBalance()));
			getSaving();
			break;
		case 2:
			getSavingDeposite();
			getSaving();
			break;
		case 3:
			getSavingWithdraw();
			getSaving();
			break;
		default:
			System.out.println("\t\tInvald Data..");
		}
	
	
	
	
	
	
	
	
	
	}
}























