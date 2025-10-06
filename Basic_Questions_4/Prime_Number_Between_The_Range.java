package Basic_Questions_4;

import java.util.Scanner;

//	this program is going to find the prime numbers between the range
public class Prime_Number_Between_The_Range {

	public static void main(String[] args) {
//		now here we will import the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user value
		System.out.print("Enter the first to find the prime number : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the second to find the prime number : ");
		int m = sc.nextInt();

		
		
//		this is the loop which will set the range
		
		for(int i=n;i<=m;i++) {
			
//			this will set the count to 0
			int count=0;
			
//			running the internal loop which will check the prime number or no
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			
//			this will print the prime number
			if(count == 2) {
				System.out.println("\nYes, "+i+" this is the prime number.");
			}
			else {
				System.out.println("\nHere this , "+i+" this is the composite number");
			}
		}
		

	}

	

}
