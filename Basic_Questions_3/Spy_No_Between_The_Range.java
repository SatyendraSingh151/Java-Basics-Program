package Basic_Questions_3;

import java.util.Scanner;

//	this program is going to find all the spy numbers between the given range
public class Spy_No_Between_The_Range {
	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the range to find all the spy numbers
		System.out.print("Give the first range to find the spy numbers : ");
		int n = sc.nextInt();
		System.out.print("Give the second range to find the spy numbers : ");
		int m = sc.nextInt();
		
//		running the loop to calculate all the spy numbers between the range\
		for(int i=n;i<=m;i++) {
//			storing the given number
			int store=i;
			
			int sum = 0, prod = 1;
			int num = i;
//			finding the sum of the digits of the number and finding the product of the digits of the number
			while(num!=0) {
				sum = sum + (num % 10);
				prod = prod * (num % 10);
				num = num/10;
			}
		
			
//			now checking the condition of the spy no
			System.out.println(sum == prod ? "\nYes "+store+" is spy number" : "\nNo "+store+" is not the spy number");

		}
		

	}

}
