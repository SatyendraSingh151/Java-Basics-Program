package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to find the sum of all the even digits in the given number limit
public class FInd_The_Sum_Of_Even_Numbers_Of_The_Given_Limit {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the lower limit : ");
		int n =sc.nextInt();
		
		System.out.print("Give the higher limit : ");
		int m =sc.nextInt();
		
		System.out.println("\nThe user given limits are "+n +" and "+m);
		
		int sum = 0;
		
//		running the loop to check the condition for the even values from the given limits
		for(int i = n; i<=m; i++) {
			if(i%2 ==0) {
				sum = sum+i;
			}
		}
		
		
		System.out.println("\nThe sum of the all the even digits in the given limits is = "+sum);

	}

}
