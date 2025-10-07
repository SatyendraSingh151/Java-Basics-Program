package Basic_Questions_5;

import java.util.Scanner;

//	this is the program which is going to find the factorial of the given number
public class Factorial {

	public static void main(String[] args) {
		
//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Give the number to find the factorial : ");
		int n = sc.nextInt();
		
//		running the loop to check the condition
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of "+n+" is = "+fact);
	}

}
