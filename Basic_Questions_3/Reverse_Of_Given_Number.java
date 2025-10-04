package Basic_Questions_3;

import java.util.Scanner;

//	this is the program to find the reverse of the given number
public class Reverse_Of_Given_Number {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input to find the reverse of the number
		System.out.print("Enter the number to find the reverse : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is = "+n);
		
//		declaring the temporary variable having 0 in it
		int temp = 0;
		
//		here running the loop with the condition to find the reverse of the given number
		while(n!=0) {
			temp = (temp*10)+n%10;
			n = n/10;
		}
		
		System.out.println("\nNow thw reversed number is = "+temp);

	}

}
