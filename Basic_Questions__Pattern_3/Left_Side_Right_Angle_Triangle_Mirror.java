package Basic_Questions__Pattern_3;


import java.util.Scanner;

//	 right angle triangle mirror from left side 
public class Left_Side_Right_Angle_Triangle_Mirror {

	public static void main(String[] args) {
		
//		taking the user input by making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the value to print the right angle triangle mirror from left side : ");
		int n = sc.nextInt();
		
//		this will run the loop as per the no of rows to be there
		for(int i = 1; i<=n; i++) {
			
//			this loop is to print the *
			for(int j = 1; j<=n; j++) {
				
//				this will check the condition where to print the *
				if(j>=i) {
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
