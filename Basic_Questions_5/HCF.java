package Basic_Questions_5;

import java.util.Scanner;


//	 this program is going to find the HCF of the two given user inputs
public class HCF {

	public static void main(String[] args) {

//		Making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
//		taking the user input for the number to find the factorial
		System.out.print("Enter the first number to find the HCF : ");
		int n = sc.nextInt();
		System.out.print("Enter the second number to find the HCF : ");
		int m = sc.nextInt();
		
		System.out.println("\nThe user given number is : "+n+", "+m);
		
		
//		here we are running the loopto check the conditions where we will find the factors of the given numbers
		if(n>0 && m>0) {
			int hcf = 1 ;
			int i, j;
			int f1 = 1,f2 = 1;
			
			for( i=2,j=2; i<=n && j<=m; i++,j++) {
				if(n%i == 0 ) {
					f1 = i;
					
				}
				if(m%j == 0) {
					f2 = j;
					
				}
				
				if(f1 == f2) {
					hcf = f1;
				}
				
			}
			
			System.out.println("The HCF of "+n+" and "+m+ " = "+hcf);
			
		}

	}

}
