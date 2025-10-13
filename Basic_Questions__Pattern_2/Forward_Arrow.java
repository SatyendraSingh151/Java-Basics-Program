package Basic_Questions__Pattern_2;

import java.util.Scanner;

//	this is going to print the forward arrow given by the user
public class Forward_Arrow {

	public static void main(String[] args) {

//		taking the Scanner object to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digit to print the forward arrow : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==1 || j==n || i+j == (n+1)) {
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
