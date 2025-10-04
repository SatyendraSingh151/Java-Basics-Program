package Basic_Questions_3;

import java.util.Scanner;

//	this is the program to check the number spy no or not
public class Spy_Number {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Give the input to check spy number or not : ");
		int n = sc.nextInt();
		
//		storing the given number
		int store=n,store2 = n;
		
		int sum = 0, prod = 1;
		
//		finding the sum of the digits of the number
		while(n!=0) {
			sum = sum + (n % 10);
			n = n/10;
		}
		System.out.println("\nThe sum of the digits of the given number is = "+sum);
		
//		finding the product of the digits of the number
		while(store!=0) {
			prod = prod * (store % 10);
			store = store/10;
		}
		System.out.println("\nThe product of the digits of the given number is = "+prod);
		
//		now checking the condition of the spy no
		System.out.println(sum == prod ? "\nYes "+store2+" is spy number" : "\nNo "+store2+" is not the spy number");

	}

}
