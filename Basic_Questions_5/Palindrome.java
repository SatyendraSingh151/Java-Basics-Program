package Basic_Questions_5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {


//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Enter the number to check whether palindrome number or not : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is : "+n);
		
//		storing the user given number
		int store = n;
		
//		now running the loop to find the reverse of the given number
		int reverse = 0;
		while(n!=0) {
			reverse = (reverse * 10) + n%10;
			n = n/10;
		}
		
		System.out.println("The reverse of the given number is : "+reverse);
		
		if(reverse == store) {
			System.out.println("\nYes "+store+" is the palindrome number");
		}
		else {
			System.out.println("\nNo "+store+" is not the palindrome number");
		}
		

	}

}
