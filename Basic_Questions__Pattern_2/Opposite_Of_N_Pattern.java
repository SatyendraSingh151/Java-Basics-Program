package Basic_Questions__Pattern_2;

import java.util.Scanner;

public class Opposite_Of_N_Pattern {
	
	public static void main(String[] args) {
		
//		taking the Scanner object to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digit to print the N mirror pattern : ");
		int n = sc.nextInt();
	
//		this is going to print the N pattern
		for(int i=1; i<=n ; i++) {
			
			for(int j=1; j<=n; j++) {
				if((j==1 || j==n) || i+j == n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
	
	
	}

}
