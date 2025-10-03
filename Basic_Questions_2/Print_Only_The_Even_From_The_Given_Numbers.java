package Basic_Questions_2;

import java.util.Scanner;

//	this program is going to find the even digits in the number given by the user
public class Print_Only_The_Even_From_The_Given_Numbers {

	public static void main(String[] args) {
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
//		taking user input
		System.out.print("Give the value : ");
		int n =sc.nextInt();
		System.out.println("\nThe user given value is = "+n);
		
		int temp = 0;
//		now getting the reverse of the number so that it can print the even from the sequence
		while(n!=0) {
			temp = (temp*10) + n%10;
			n = n/10;
		}
		System.out.println("The reversed value, so that we can print it in the sequence format of the number is = "+ temp);
		
		
		int data,count = 0;
		
//		now getting the even digits from the given number
		System.out.println("\nThe even digits from the given number is : ");
		while(temp != 0) {
			data = temp%10;
			if(data %2 == 0) {
				count++;
				System.out.println(data);
			}
			temp = temp/10;
		}
		
//		this is going to check if no even digits found in the number
		if(count==0) {
			System.out.println("\nSorry, there is no any even digits in the given number.");
		}
	}

}
