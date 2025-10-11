package Basic_Questions__Pattern_1;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
//		making the object of the Scanner class to take the user input
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number to print the star  in rows = ");
			int n = sc.nextInt();
			

			for(int i=1; i<=n; i++) {
				System.out.println("* ");
			}
	}

}
