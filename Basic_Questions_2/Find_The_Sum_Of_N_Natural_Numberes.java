package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to find the sum of natural numbers
public class Find_The_Sum_Of_N_Natural_Numberes {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the number : ");
		int n =sc.nextInt();
		
		System.out.println("\nThe user given number is = "+n);
		
		int sum = 0;
		
//		running the loop to check the condition for the even values from the given limits
		for(int i = 1; i<=n; i++) {
			sum +=i;
		}
		
		
		System.out.println("\nThe sum of the natural number is = "+sum);

	}

}
