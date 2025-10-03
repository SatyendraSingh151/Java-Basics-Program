package Basic_Questions_2;

import java.util.Scanner;

//	to buy the desired product based on the condition
public class Buy_Product_Of_Desired_Rate {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking the user price
		System.out.print("Give the price you have to buy in : ");
		double price =sc.nextDouble();
		
//		taking the user size
		System.out.print("Enter the size of your's : ");
		char size = sc.next().charAt(0);
		
//		here applying the condition for the value given by the user to check
		if(price <= 1000 && size =='s') {
			System.out.println("Yes, eligible to buy the T-Shirt.");
		}
		else {
			System.out.println("No, not eligible to buy the T-Shirt, the requirement doesnot matches here.");
		}
		
		

	}

}
