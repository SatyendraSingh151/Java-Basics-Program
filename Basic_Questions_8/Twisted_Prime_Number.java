package Basic_Questions_8;

import java.util.Scanner;

//	this program is going to check the twisted prime number or not ?
public class Twisted_Prime_Number {

	public static void main(String[] args) {

//	making the object of the Scanner class to take the user input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to check whether it is the twisted prime number or not ? = ");
		int n = sc.nextInt();
		
		System.out.println("The use given number is : "+n+"\n");
		
//		checking the condition for prime number

		int temp = 0;
		for(int i=1; i<=n/2; i++) {
			
			if(n %i == 0) {
				 temp++;
//				
			}
		}
			
//			storing if the user given number is prime number
			int store1 =n;
			if(temp <=2) {
							
				System.out.println("Yes "+n+" is the prime number.\n");
	//				now here we will reverse the prime number
				int reverse = 0;
				while(n != 0) {
					reverse = (reverse*10) + n%10;
					n = n/10;
					
				}
				
				
				System.out.println("The reverse of the prime number is : "+reverse);
				
//				now checking the condition for the reverse
				int count = 0;
				for(int j= 1; j<=reverse/2; j++) {
					if(reverse %j == 0) {
						count++;
					}
				}
				if(count <= 2) {
					System.out.println("\nThe generated prime number from "+store1+" is = "+reverse);
				}
				else {
					System.out.println("\nSorry "+store1+" is the prime number but the generated "+reverse+" is not the prime number.");
				}
				
		   }
			
			
			else {
				System.out.println("No "+store1+" is not the prime number.\n");
			}
		

	   }

	
}
