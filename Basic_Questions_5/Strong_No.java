package Basic_Questions_5;

import java.util.Scanner;

//	this program is going to check the strong number or not (the sum of the factorial of the digit is equal to the number)
public class Strong_No {

	public static void main(String[] args) {

//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Give the number to check the \'strong number or not\'(the sum of the factorial of the digit is = the number or not) : ");
		int n = sc.nextInt();

		
		
//		storing the user given value
		int temp = n;
		
		int sum = 0; 
		
//		running the loop to check the condition for the factorial of digit
		while(n!=0) {
			
			int fact = 1;
			int check = n%10;
			n=n/10;
			
//			running the loop to find the condition for the factorial 
			for(int i=1; i<=check;i++) {
				fact = fact*i;
				
			}
			
			System.out.println("The factorial of the digit "+check+" is : "+fact);
			
			sum = sum+fact;
		}
		
		System.out.println("");
		
//		now checking the condition for the strong number or not ?
		
		System.out.println("The user given number is : "+temp);
		System.out.println("The sum of the factorial of the digit of given number is : "+sum);
		
		if(sum == temp) {
			System.out.println("\nYes "+temp+" is the strong number beacuse the given number and the sum of the factorial of the digits are same");
		}
		else {
			System.out.println("\nNo "+temp+" is not the strong number beacuse the given number and the sum of the factorial of the digits are not same");
		}
	}

}
