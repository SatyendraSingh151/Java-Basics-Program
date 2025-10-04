package Basic_Questions_3;

import java.util.Scanner;

//	this program is to give the basic functionalities of the calculator
public class Calculator {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		passing the message for the user to perform the operation at specific code
		System.out.println("\n1 - Add\n2 - Substract\n3 - Multiply\n4 - Division\n5 - Modulos\n6 - Exit");

//		taking the user input for which we are going to perform the action
		System.out.print("\nEnter the first value : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second value : ");
		int b = sc.nextInt();
		

		boolean status = true;
		while(status) {
//			passing the message for the user to perform the operation at specific code
			System.out.println("\n1 - Add\n2 - Substract\n3 - Multiply\n4 - Division\n5 - Modulos\n6 - Exit");

//			taking the user input to perform the operation
			System.out.print("\nEnter your choice to perform the operation : ");
			int choice = sc.nextInt();
			
			switch(choice) {
						
						case 1 :{
							System.out.println("\nThe sum of "+a+" and "+b +" is = "+(a+b));
							break;
							}
						case 2 :{
							System.out.println("\nThe substraction of "+a+" and "+b +" is = "+(a-b));
							break;
							}
						case 3 :{
							System.out.println("\nThe multiplication of "+a+" and "+b +" is = "+(a*b));
							break;
							}
						case 4 :{
							System.out.println("\nThe division of "+a+" and "+b +" is = "+(a/b));
							break;
							}
						case 5 :{
							System.out.println("\nThe modulos of "+a+" and "+b +" is = "+(a%b));
							break;
							}
						case 6 :{
							status = false;
							System.out.println("\nThank you for using the calculator.");
							break;
							}
						default : {
							System.out.println("\nOpps! you opted the wrong choice please try again.");
						}
					
					}
			
		}
		

	}

}
