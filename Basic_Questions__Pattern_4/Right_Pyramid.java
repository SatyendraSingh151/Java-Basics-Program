package Basic_Questions__Pattern_4;

import java.util.Scanner;

//	this is the program to print the right pyramid
public class Right_Pyramid {

	public static void main(String[] args) {

//	taking the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Enter the number to print the right pyramid : ");
		int n = sc.nextInt();
		
//		this loop is going to run for the number of the rows
		for(int i=1; i<=2*n-1; i++) {
			
//			this loop is going to print the * by the looping condition
			for(int j=1; j<=n; j++) {
				
//				here printing the * from checking the condition
				if(i>=j && i+j<=2*n) {
					System.out.print("* ");
				}
//				this is going to print the proper space
				else {
					System.out.print("  ");
				}
			}
//			here we will change the line 
			System.out.println();
			
		}

	}

}
