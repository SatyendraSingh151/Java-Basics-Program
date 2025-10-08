package Basic_Questions_6;

import java.util.Scanner;

public class Finding_Square {

	public static void main(String[] args) {

//		Making the object of the Scanner class which will help to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Enter the number to find the square root : ");
		double n = sc.nextDouble();
		
		System.out.println("\nThe user given number is : "+n);
		
//		now applying the another logic to find other than sqrt function
		for(double i =1; i<=n/2; i++) {
			if(i*i == n) {
				System.out.println("The square root of "+n+ " is = "+i);
				break;
			}
			else {
				System.out.println("The square root of "+n+ " is = "+(double)Math.sqrt(n));
				break;
			}
		}

	}

}
