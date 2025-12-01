package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the value to calculate the factorial : ");
		int n = sc.nextInt();
		int fact = 1;
		if(n>0) {
			for(int i=2; i<=n; i++) {
				fact = fact*i; 
			}
			
			System.out.println("The factorial of "+n+" is = "+fact);
		}
		else {
			System.out.println("Vlaue is 0 or less than 0.");
		}

	}

}
