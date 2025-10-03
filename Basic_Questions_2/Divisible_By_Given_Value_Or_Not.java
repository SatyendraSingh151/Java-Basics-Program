package Basic_Questions_2;

import java.util.Scanner;

//	 this program is going to check, if it is divisible by the value given or not
public class Divisible_By_Given_Value_Or_Not {

	public static void main(String[] args) {
		
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the \'Divident\' value : ");
		double n =sc.nextDouble();
		
		System.out.print("Give the \'Divisor\' value : ");
		double m =sc.nextDouble();
		
		System.out.println((n%m==0? "yes "+n+" it is divisible by "+m : "No "+n+" it is divisible by "+m ));

	}

}
