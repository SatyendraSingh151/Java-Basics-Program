package Basic_Questions_3;

import java.util.Scanner;

//	This program is going to check the given number is armstrong number or not
public class Armstrong_No {

	public static void main(String[] args) {
//		importing the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Give the input which you want to check armstrong or not : ");
		int n = sc.nextInt();
		
//		storing the given value
		int temp = n;
		
		int dummy=0,count=0;
		
//		first counting the no of digits of the give number
		if(n>=1) {
			while(n!=0) {
				count++;
				n=n/10;
			}
			System.out.println("\nThe given number is of "+count+" digit.");

		}
				n = temp;
//		running the loop to check the condition
				
		if(n>0){
			int dum;
			while(n!=0) {
				dum = n%10;
				dummy = dummy + (int) Math.pow(dum, count);
				n = n/10;
				 
			}
			System.out.println("\nThe digit and the power of the given number is = "+dummy);
		}
		
		if(dummy == temp) {
			System.out.println("\nYes "+temp+ " is the armstrong number.");
		}
		else {
			System.out.println("\nNo "+temp+ " is not the armstrong number.");
		}
		
		
		
		
	}

}
