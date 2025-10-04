package Basic_Questions_3;

import java.util.Scanner;

public class Even_Divisible_By_Given_Digit_Or_Number_Or_Not {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Give the input which you want to check even or not : ");
		double n = sc.nextInt();
		System.out.print("Give the digit/number from which you want to divide : ");
		double m = sc.nextInt();
		
		if(n%2==0) {
			if(n%m==0) {
				System.out.println("\nYes "+n+" is even number and also divisible by "+m);
			}
			else {
				System.out.println("\nYes "+n+" is even number but not divisible by "+m);
			}
		}
		else {
			if(n%m==0) {
				System.out.println("\n"+n+" is odd number and also divisible by "+m);
			}
			else {
				System.out.println("\n"+n+" is odd number but not divisible by "+m);
			}
		}
		

	}

}
