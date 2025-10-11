package Basic_Questions_7;

import java.util.Scanner;

//	this is the program to find the fibonacci pattern
public class Fibonacci_No {

	public static void main(String[] args) {
		
//		here we will make the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);

//		taking the user input to check
		System.out.print("Enter the number to print the fibonacci number : ");
		int n = sc.nextInt();
		
//		printing the given number to print the fibonacci number
		System.out.println("\nThe user given number is : "+n+"\n\n");

		int first = 0;
		int second = 1;
		int third = 0;
	
		System.out.print(first+"  "+second+"  ");
		
		for(int i=1; i<=n-2; i++) {
			
			third = first+second;
			
			System.out.print(third+"  ");
			
			first=second;
			second = third;
		}
	}

}
