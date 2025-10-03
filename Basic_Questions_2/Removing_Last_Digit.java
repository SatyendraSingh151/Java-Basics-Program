package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to remove the last digit
public class Removing_Last_Digit {

	public static void main(String[] args) {

//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the value : ");
		int n =sc.nextInt();
	
		int temp;
		System.out.println("The value given is = "+n);
		
//		removing the last digit
		n=n/10;
		System.out.println("The value after removing the last digit = "+n);

		
	}

}
