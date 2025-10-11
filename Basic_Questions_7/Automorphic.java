package Basic_Questions_7;

import java.util.Scanner;

//	checking for the automorphic number (the number is present in the last of the square of the number)
public class Automorphic {

	public static void main(String[] args) {
		
//		here we will make the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);

//		taking the user input to check
		System.out.print("Enter the number to check the automorphic or not : ");
		int n = sc.nextInt();

//		to count the digit of the given number to check 
		int count=0;
		
//		printing and storing the given number
		System.out.println("\nThe user given number is : "+n);
		int store = n;
		
		while(store != 0) {
			count++;
			store = store/10;
		}
		
		System.out.println("The given number is "+count+" digit number.");
		
//		finding the square of the given number
		int square = n*n;
		System.out.println("The square of the given number "+n+" is = "+square);
		
//		now extracting the last digits of the square as the given digit number
		int reverse = 0;
		
		for(int i=1;i<=count;i++) {
			reverse = (reverse*10)+square%10;
			square = square/10;
			
		}
		
//		now again reversing the extracted digits to check
		
		int check = 0;
		for(int i=1; i<=count; i++) {
			check = (check*10)+reverse%10;
			reverse = reverse/10;
		}
		
//		printing the last extracted digit
		System.out.println("The last digit of the square extracted is : "+check);
		
		
		
//		checking the condition
		if(check == n) {
			System.out.println("\nYes "+n+" is the automorphic number");
		}
		else {
			System.out.println("\nNo "+n+" is not the automorphic number");
		}
	}

}
