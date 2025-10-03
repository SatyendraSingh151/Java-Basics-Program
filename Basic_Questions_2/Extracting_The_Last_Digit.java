package Basic_Questions_2;

import java.util.Scanner;

//	this is the program to extract the last digit
public class Extracting_The_Last_Digit {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the value : ");
		int n =sc.nextInt();
		System.out.println("\nThe given value by the user is =  "+n);
		
		System.out.println("\nPrinting the all last digits of the given value.");
		int temp;
		while(n!=0) {
			temp = n%10;
			System.out.println(temp);
			n = n/10;
		}

	}

}
