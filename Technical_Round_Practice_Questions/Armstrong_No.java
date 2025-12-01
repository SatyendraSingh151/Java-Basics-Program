package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to check armstrong no : ");
		int n = sc.nextInt();
		
		int temp = n, temp2=n;
		
		int count = 0, arm = 0;
		
		// counting the digit of the no
		while(n!=0) {
			count++;
			n=n/10;
		}
		
		while(temp!=0) {
			arm = arm +(int) Math.pow(temp%10, count);
			temp = temp/10;
		}
		
		if(arm == temp2) {
			System.out.println("Yes,Armstrong no.");
		}
		else {
			System.out.println("No, not Armstrong no.");
		}
		

	}

}
