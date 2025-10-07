package Basic_Questions_5;

import java.util.Scanner;

//this is the program which is going to find the factorial of each digit
public class Factorial_Of_Each_Digit {

	public static void main(String[] args) {
//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Give the number to find the factorial of each digit : ");
		int n = sc.nextInt();
		
//		storing the given number
		int store = n;
		
//		storing the digit of the number
		int temp;
		
		while(store!=0) {
			temp = store%10;
			store=store/10;
			
//			now this is going to find the factorial of the last digit
//			running the loop to check the condition
			int fact = 1;
			for(int i=1; i<=temp; i++) {
				fact = fact*i;
			}
			System.out.println("\nThe factorial of digit "+temp+" is = "+fact);

			
		}
			

	}

}
