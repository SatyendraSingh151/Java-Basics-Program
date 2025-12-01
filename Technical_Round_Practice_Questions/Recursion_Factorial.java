package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Recursion_Factorial {
	
//	declaring a static method
	
	public static int fact(int n) {
	
		int f = 1;
		
		if(n==1) {
			return f;
		}
		else {
			f = n*fact(n-1);
			return f;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to calculate the factorial : ");
		int n = sc.nextInt();
		int fact = 1;
		
		if(n <= 0) {
			System.out.println("The value is 0 or less than 0");
		}
		
		else {
			System.out.println("The factorial of the value "+n+ " is = "+fact(n));
		}

	}

}
