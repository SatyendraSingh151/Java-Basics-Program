package Basic_Questions__Pattern_1;

import java.util.Scanner;

//	this program is going to print the triangle
public class Ex4_right_angle_triangle {

	public static void main(String[] args) {
		
//		making the object of the Scanner class to take the user input
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number to print the star pattern = ");
			int n = sc.nextInt();
		
			for(int i=1;i <=n; i++) {
				for(int j =1; j<=i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}

	}

}
