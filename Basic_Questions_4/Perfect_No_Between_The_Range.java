package Basic_Questions_4;

import java.util.Scanner;


//	finding the perfect number betweent the range of the given value
public class Perfect_No_Between_The_Range {

	public static void main(String[] args) {
		
//		now here we will import the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user value
		System.out.print("Enter the first to find the factors : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the second to find the factors : ");
		int m = sc.nextInt();

		
		
//		runinng the loop to run the condition for the range
		for(int i = n; i<m; i++) {
			
//			this will set the sum to 0
			int sum = 0;
			
//			this is going to find the perfect number or not
			for(int j=1; j<i; j++) {
				if(i%j == 0) {
					sum = sum+j;
				}
			}
			
//			here checking the condition of the perfect number
			if(sum == i) {
				System.out.println("\nYes," +i +" is the perfect no.");
			}
			
		}
	}

}
