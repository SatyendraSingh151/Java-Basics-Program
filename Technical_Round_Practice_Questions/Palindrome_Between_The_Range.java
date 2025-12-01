package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Palindrome_Between_The_Range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the maximum range  to check all the palindrome no : ");
		int n = sc.nextInt();
		
		
		System.out.println("Palindrome no. between the given range are as follows :");

		for(int i=1; i<=n; i++) {
			int data = i;
			int temp = 0;
			int check = i;
			
			while(data!=0) {
				temp = temp*10 + (data%10);
				data = data/10;
			}
			if(temp == check) {
				System.out.print(check+" ");
			}
		}
		
		
	}

}
