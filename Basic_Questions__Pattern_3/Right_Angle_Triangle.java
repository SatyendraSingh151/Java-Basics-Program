package Basic_Questions__Pattern_3;


import java.util.Scanner;

//	 right angle triangle
public class Right_Angle_Triangle {

	public static void main(String[] args) {
		
//		taking the user input by making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the value to print the triangle : ");
		int n = sc.nextInt();
		
//		this will run the loop as per the no of rows to be there
		for(int i = 1; i<=n; i++) {
			
//			this loop is to print the *
			for(int j = 1; j<=n; j++) {
				
//				this will check the condition where to print the *
				if(i==j || i>=j) {
					System.out.print("* ");
				}
//				this will check the condition where to print the space ( )
				else {
					System.out.print("  ");
				}
			}
			
//			changing the line
			System.out.println();
		}
		
		
	}

}
