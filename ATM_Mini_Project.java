package Basic_Questions_3;

import java.util.Scanner;

public class ATM_Mini_Project {
	
//	storing the basic details of the account holder
	private String name;
	private long acc_no;
	private double balance;
	
//	now using the getter and setter we will get and set these values
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public long getAcc_no() {
		return acc_no;
	}

	
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		making the object of the class to access the private members via the getter and the setter
		ATM_Mini_Project customer1 = new ATM_Mini_Project();
		
//		now taking the values of the account holder
		System.out.print("Enter the Account holder's name : ");
		String name =sc.nextLine();
		System.out.print("Enter the Account Number : ");
		long acc_no = sc.nextLong();
		System.out.print("Enter the balance in the account : ");
		double balance = sc.nextDouble();
		
//		setting the value via the setter
		customer1.setName(name);
		customer1.setAcc_no(acc_no);
		customer1.setBalance(balance);
		
		boolean status = true;
		
		while(status) {
			
//			passing a message to the user
			System.out.println("\n1 - A/C Details\n2 - Deposit\n3 - Withdraw\n4 - Check balance\n5 - Exit");
			
//			taking the user choice
			System.out.print("\nEnter your choice to perform the action : ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:{ 
//					this will show the account details
					System.out.println("\nThe account details are :\n\nName : "+customer1.getName()+"\nAccount No. : "+customer1.getAcc_no()+"\nAvailable balance : "+customer1.getBalance());
					break;
				}
				case 2:{
//					this will help to deposit in the account
					System.out.print("\nEnter the amount you want to deposit into the account : ");
					double deposit = sc.nextDouble();
					double updated_balance = deposit +customer1.getBalance();
					customer1.setBalance(updated_balance);
					System.out.println(deposit+" rs is deposited sucessfully in the account.\nAvailable balance is "+updated_balance+" rs.");
					break;
				}
				case 3:{
//					this will perform the withdraw action in the account
					System.out.print("\nEnter the amount you want to withdra from your account : ");
					double withdraw = sc.nextDouble();
					if(withdraw <= customer1.getBalance()) {
						double withdrawl_balance = customer1.getBalance() - withdraw;
						customer1.setBalance(withdrawl_balance);
						System.out.println(withdraw+" rs is withdrawn sucessfully.\nAvailable balance is "+withdrawl_balance+" rs.");
						break;
					}
					else {
						System.out.println("\nInsufficient balance.");
						break;
					}
					
				}
				
				case 4:{
//					this will check the balance
					System.out.println("\nAvailable balance = "+customer1.getBalance());
					break;
					
				}
				
				case 5:{
//					this will exit from the loop
					status = false;
					System.out.println("\nThank you for using the Banking System.");
					break;
				}
				default:{
//					this will display a default message on the wrong choice
					System.out.println("\nOpps! you made a wrong choice, please try again.");
				}
			}
			
		}
		

	}

	

}
