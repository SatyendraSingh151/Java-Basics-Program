package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to print all the digits of the given number
public class Print_ALl_The_Digit_From_The_Given_Value {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the value : ");
		int a =sc.nextInt();
		System.out.println("\nThe user given value is = "+a);
		
//	storing the value in the variable
		int keep = a;
		
		
//		taking a temporary variable
		int data,temp=0;
		
//		running the loop for the condition to store the reverse of the program so that we can print the digits from starting
		while(a!=0) {
			data = a%10;
			temp = (temp*10)+data;
			a = a/10;
			
		}
		System.out.println("The reversed value, so that we can print it in the sequence is : "+temp);
		
//		now we will print the digits from starting as the user gives 
		System.out.println("\nPrinting the digits of the given value");
		
		while(temp != 0) {
			System.out.println(temp%10);
			temp = temp/10;
		}

	}

}
