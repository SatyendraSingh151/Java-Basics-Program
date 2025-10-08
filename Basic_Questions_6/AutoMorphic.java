package Basic_Questions_6;

import java.util.Scanner;

//	this question is going to check the automorphic or not -> the square should end with the given number itself
public class AutoMorphic {

	public static void main(String[] args) {
		
		
//		Making the object of the Scanner class which will help to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input
		System.out.print("Enter the number to check \'Automorphic number\' number or not : ");
		int n = sc.nextInt();
		
		System.out.println("\nThe user given number is : "+n);
		
		int store = n,crossCheck = n;
		int count = 0;
		
		
//		counting the digit of the given number
		while(n!=0) {
			count++;
			n = n/10;
		}
		System.out.println("The given numberr "+store+" is of "+count+" digit number.");
		
		
		
//		now finding the square of the given number
		int square = store*store;
		System.out.println("The square of the given number "+store+" is : "+square);
		
		int verify=0;
		
//		now here running the loop to take the last digits of the square root to cross check
		for(int i=1; i<=count; i++) {
			verify = (verify*10)+square%10;
			square = square/10;
		}
		
		
//		now reversing the square number to check
		
		int reverse = 0;
		while(verify!=0) {
			reverse = (reverse*10)+verify%10;
			verify = verify/10;
		}
		System.out.println("The last "+count+ " digit number of the square is : "+reverse);
		
//		checking the condition
		if(crossCheck == reverse) {
			System.out.println("\nYes "+crossCheck+" this is the automorphic number");
		}
		else {
			System.out.println("\nNo "+crossCheck+" this is the automorphic number");
		}
		

	}

}
