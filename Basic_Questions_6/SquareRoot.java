package Basic_Questions_6;

import java.util.Scanner;


//	this is going to find the square root of the user given number
public class SquareRoot {

	public static void main(String[] args) {
//		Making the object of the Scanner class which will help to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Enter the number to find the square root : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is : "+n);

		System.out.println("The square root is = "+(double)Math.sqrt(n));
		
	}

}
