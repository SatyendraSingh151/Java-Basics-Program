package Basic_Questions_2;

import java.util.Scanner;

//	this is the program to check the largest value among the 3 given values
public class Largest_Among_Three_Numbers {
	
	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the first value : ");
		int a =sc.nextInt();
		
		System.out.print("Give the second value : ");
		int b =sc.nextInt();
		
		System.out.print("Give the third value : ");
		int c =sc.nextInt();
		
//		printing the value based on the condition, here we have used the ternary operator
		System.out.println("The given values are "+ a+", "+b+ " and "+c+"and among these two "+(a>b? (a>c? a : c) : (b>c? b : c) )+" is the greater value");

	}


}
