package Basic_Questions_6;

import java.util.Scanner;

//	this is going to find the perfect no -> the sum of the factors of the number is equals to the number
public class Perfect_No {

	public static void main(String[] args) {
	
//		Making the object of the Scanner class which will help to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Enter the number to check the perfect number or not : ");
		int n = sc.nextInt();
		
//		storing the user given number
		int store = n;
		
		System.out.println("\nThe user given number is : "+n);
		
		int sum = 0;
		System.out.println("The divisor of the given number is below");
		for(int i = 1; i<n ; i++) {
			if(n%i == 0) {
				sum = sum+i;
				System.out.println(i);
			}
		}
		System.out.println("The sum of the divisor of the given number is : "+sum);
		
//		checking the perfect number condition
		if(store == sum ) {
			System.out.println("Yes "+store +" is the perfect number");
		}
		else {
			System.out.println("No "+store +" is not the perfect number");
		}
		
		
	}

}
