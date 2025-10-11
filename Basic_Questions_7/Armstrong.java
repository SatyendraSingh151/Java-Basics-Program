package Basic_Questions_7;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
//		here we will make the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);

//		taking the user input to check
		System.out.print("Enter the number to check the armstrong number or not : ");
		int n = sc.nextInt();

//		to count the digit of the given number to check 
		int count=0;
		
//		printing and storing the given number
		System.out.println("\nThe user given number is : "+n);
		int store = n,store2 = n;
		
		while(store2 != 0) {
			count++;
			store2 = store2/10;
		}
		
		System.out.println("The given number is "+count+" digit number.");
		
		
//		now we will take the last digit and find the power of the digit to the count digit of the number
		int arm = 0;
		
		while(store != 0) {
			arm = arm + (int)Math.pow(store%10 , count);
			System.out.println(store%10 +" -> "+(int)Math.pow(store%10 , count));
			store = store/10;
		}
		System.out.println("_________________________");
//		printing the calculated number
		System.out.println("The sum is : "+arm);

		
//		checking the condition
		if(n == arm) {
			System.out.println("\nYes "+n+" is the armstrong number");
		}
		else {
			System.out.println("\nNo "+n+" is not the armstrong number");
		}
	}

}
