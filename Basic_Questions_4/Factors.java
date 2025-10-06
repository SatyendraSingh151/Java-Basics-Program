package Basic_Questions_4;

import java.util.Scanner;

//	 this is the program is to find the factors of the given number
public class Factors {

	public static void main(String[] args) {
		
//		now here we will import the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user value
		System.out.print("Enter the value to find the factors : ");
		int n = sc.nextInt();
		
//		running the loop and giving the condition
		System.out.println("The factors of the given "+ n+" number is below.\n");
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		

	}

}
