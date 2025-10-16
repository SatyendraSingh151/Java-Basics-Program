package Basic_Questions__Pattern_5;

import java.util.Scanner;

//	 this program is going to find the left and the right pyramis together
public class Left_Right_Pyramid_Together {

	public static void main(String[] args) {
		
//		taking the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the input to print the left and the right pyramid together : ");
		int n = sc.nextInt();
		
//		loop for running the outer loop that is the row
		for(int i=1; i<=n ;i++) {
			
//			this loop is to print the * 
			for(int j= 1; j<=n; j++) {
				
//				checking the condition to print the *
				if((i>=j && i+j<=n+1) || (i+j >= n+1 && j>=i)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
//			changing the line
			System.out.println();
		}
		
	}

}
