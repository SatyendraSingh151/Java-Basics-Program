package Basic_Questions__Pattern_2;

import java.util.Scanner;

//	 this is going to print the primary diagonal
public class Primary_Diagonal_And_Secondary_Diagonal {

	public static void main(String[] args) {
		
//		taking the Scanner object to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the digit to print both diagonal : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j || i+j == n+1) {
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
