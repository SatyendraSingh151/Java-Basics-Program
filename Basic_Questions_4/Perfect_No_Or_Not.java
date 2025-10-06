package Basic_Questions_4;

import java.util.Scanner;


//	 this is going to check the perfect number or not
public class Perfect_No_Or_Not {

	public static void main(String[] args) {
//		now here we will import the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user value
		System.out.print("Enter the value to find the factors : ");
		int n = sc.nextInt();
		
		int sum =0;
		
//		running the loop and giving the condition
		System.out.println("The factors of the given "+ n+" number is below.\n");
		for(int i = 1; i<n; i++) {
			if(n%i == 0) {
				sum = sum+i;
				System.out.println(i);
			}
		}
		if(sum == n) {
			System.out.println("\nYes, "+n+" this is the perfect no.");
		}
		else {
			System.out.println("\nNo, "+n+ " this is not the perfect no.");
		}
		

	}

}
