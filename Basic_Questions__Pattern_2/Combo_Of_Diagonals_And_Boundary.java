package Basic_Questions__Pattern_2;

import java.util.Scanner;

//	this is going to print the forward arrow given by the user
public class Combo_Of_Diagonals_And_Boundary {

	public static void main(String[] args) {

//		taking the Scanner object to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digit to print the backward arrow : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n ||j==1 || j==n || i==j || i+j == n+1 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
//			to change the line
			System.out.println();
		}

	}

}
