package Basic_Questions_5;

import java.util.Scanner;

//	 this program is going to find the reverse of the given number
public class Reverse {

	public static void main(String[] args) {

//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Enter the number to find the reverse the number : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is : "+n);
		
//		now running the loop to find the reverse of the given number
		int reverse = 0;
		while(n!=0) {
			reverse = (reverse * 10) + n%10;
			n = n/10;
		}
		
		System.out.println("The reverse of the given number is = "+reverse);

	}

}
