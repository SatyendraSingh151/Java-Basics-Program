package Basic_Questions__Pattern_1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		making the object of the Scanner class to take the user input
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number to print the star in columns = ");
			int n = sc.nextInt();
			

			for(int i=1; i<=n; i++) {
				System.out.print("* ");
			}
	}

}
