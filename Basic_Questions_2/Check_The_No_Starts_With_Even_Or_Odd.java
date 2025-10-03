package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to find the number starting with even digit or odd digit
public class Check_The_No_Starts_With_Even_Or_Odd {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the number to check it starts with even/odd digits : ");
		int n =sc.nextInt();
		System.out.println("\nThe user given nummber is = "+n);
		
		int temp = 0;
//		now getting the reverse of the number
		while(n!=0) {
			temp = (temp*10)+n%10;
			n = n/10;
		}
		System.out.println("The reverse of the number is to check the last digit even/odd as the last digit here shows the first digit of the given number = "+temp);
		
		int check=0;
//		now checking the no, whether it starts with even or odd digit
		while(temp!=0) {
			if((temp%10) %2 ==0) {
				check++;
				break;
			}
			break;
		}
		if(check == 0) {
			System.out.println("\nIt starts with odd digit.");
		}
		else {
			System.out.println("\nIt starts with even digit.");
		}

	}

}
