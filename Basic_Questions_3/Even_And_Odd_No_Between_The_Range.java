package Basic_Questions_3;

import java.util.Scanner;

//	this program is going to find the odd numbers between the range of the given two value
public class Even_And_Odd_No_Between_The_Range {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the range to calculate the odd numbers
		System.out.print("Give the first range to find the odd numbers between the range : ");
		int n = sc.nextInt();
		System.out.print("Give the second range to find the odd numbers between the range : ");
		int m = sc.nextInt();
		

		System.out.println("Getting all the even numbers between the range.");
		for(int i = n; i<=m; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Getting all the odd numbers between the range.");
		for(int i = n; i<=m; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
