package Basic_Questions_3;

import java.util.Scanner;

public class Palindrome_Or_not {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input to find the reverse of the number
		System.out.print("Enter the number to check the palindrome or not : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is = "+n);
		
//		storing the given number for future use
		int store = n;
		
//		declaring the temporary variable having 0 in it
		int temp = 0;
		
//		here running the loop with the condition to find the reverse of the given number
		while(n!=0) {
			temp = (temp*10)+n%10;
			n = n/10;
		}
		
		if(store == temp) {
			System.out.println("\nYes "+ store+" is the palindrome number");
		}
		else {
			System.out.println("\nNo "+ store+" is the palindrome number");
		}


	}

}
