package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to check prime no or not  : ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=n/2; i++) {
			if(n%2 == 0) {
				count++;
			}
		}
		
		if(count <=2) {
			System.out.println("Prime no.");
		}
		else {
			System.out.println("Not Prime no.");
		}

	}

}
