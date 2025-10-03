package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to find the count of the digits in the given number
public class Count_The_Number_Of_Digits {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the number to find the count of all the digits : ");
		int n =sc.nextInt();
		System.out.println("\nThe user given nummber is = "+n);
		
		int count = 0;
//		now getting the sum of the digits
		while(n!=0) {
			count++;
			n = n/10;
		}
		System.out.println("The count of the digits in the given number is = "+count);

	}

}
