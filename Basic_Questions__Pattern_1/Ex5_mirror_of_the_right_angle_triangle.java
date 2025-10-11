package Basic_Questions__Pattern_1;

import java.util.Scanner;

//	this is going to print the mirror of the right angle triangle
public class Ex5_mirror_of_the_right_angle_triangle {

	public static void main(String[] args) {

//		making the object of the Scanner class to take the user input
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter the number to print the star pattern = ");
			int n = sc.nextInt();
		
			for(int i=1;i <=n; i++) {
				for(int j =1; j<=n; j++) {
					if(i+j > 4) {
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
