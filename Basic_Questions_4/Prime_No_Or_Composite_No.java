package Basic_Questions_4;

import java.util.Scanner;

//	 this will check the prime number or not
public class Prime_No_Or_Composite_No {

	public static void main(String[] args) {


//		now here we will import the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user value
		System.out.print("Enter the number to check it is prime number or not : ");
		int n = sc.nextInt();
		
		
//		this will send the count to 0
		int count=0;
		
//		here this is going to check the condition for checking the prime number
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
//		this will check the prime number
		if(count == 2) {
			System.out.println("\nYes, "+n+" this is the prime number.");
		}
		
		
		else {
			System.out.println("\nHere, "+n+" this is the composite number");
		}
		

	}

}
