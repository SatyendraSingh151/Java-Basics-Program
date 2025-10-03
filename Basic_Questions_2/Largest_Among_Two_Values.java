package Basic_Questions_2;

import java.util.Scanner;
//	this program is going to check the largest among the two values
public class Largest_Among_Two_Values {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the first value : ");
		int n =sc.nextInt();
		
		System.out.print("Give the second value : ");
		int m =sc.nextInt();
		
//		printing the value based on the condition, here we have used the ternary operator
		System.out.println("The given values are "+ n+ " and "+m+"and among these two "+(n>m? n:m)+" is the greater value");

	}

}
