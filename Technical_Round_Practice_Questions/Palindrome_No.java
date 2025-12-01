package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Palindrome_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to check the palindrome no : ");
		int n = sc.nextInt();
		
		int temp=0,check = n;
		
		while(n!=0) {
			temp = temp*10 + (n%10);
			n = n/10;
		}
		if(check == temp) {
			System.out.println("Yes, Palindrome no.");
		}
		else {
			System.out.println("Not Palindrome.");
		}

	}

}
