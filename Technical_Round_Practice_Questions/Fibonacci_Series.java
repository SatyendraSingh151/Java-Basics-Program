package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to find the fibonacci no : ");
		int n = sc.nextInt();
		
		
		int first = 0, second = 1, third;
		
			if(n<=0) {
				System.out.println("It cannot be negative or zero.");
			}
		
		 	System.out.print("Fibonacci Series up to " + n + " terms: ");

	        if (n >= 1) {
	            System.out.print(first);
	        }
	        if (n >= 2) {
	            System.out.print(", " + second);
	        }
	        
	     // Generate subsequent terms
	        for (int i = 3; i <= n; i++) {
	            int nextTerm = first + second;
	            System.out.print(", " + nextTerm);

	            // Shift the terms forward for the next iteration
	            first = second;
	            second = nextTerm;
	        }
	        System.out.println();
		

		}

	}


