package User_Input_Of_All_Data_Type;

//  importing the Scanner class
import java.util.Scanner;


public class Taking_User_Input {

	public static void main(String[] args) {
		// making the object of the Scanner class and using the reference variable to take the user input
		Scanner sc = new Scanner(System.in);
		
//		byte data
		System.out.print("Give the byte data : ");
		byte b =sc.nextByte();
		
//		short data
		System.out.print("\nGive the short data : ");
		short s = sc.nextShort();
		
//		int type data input
		System.out.print("\nGive the int data : ");
		int n = sc.nextInt();
		
		
//		long data
		System.out.print("\nGive the long data : ");
		long l = sc.nextLong();
		
		
//		float type data
		System.out.print("\nGive the float data : ");
		float f = sc.nextFloat();
		
//		double data
		System.out.print("\nGive the double data : ");
		double d = sc.nextDouble();
		
//		String data
		System.out.print("\nGive the String data : ");
		String str = sc.nextLine();
		
		
//		character type data
		System.out.print("\nGive the character data : ");
		char c = sc.next().charAt(0);
		

		



		
		System.out.println("\nThe byte data given is : "+b);
		System.out.println("The short data given is : "+s);
		System.out.println("The integer data given is : "+n);
		System.out.println("The long data given is : "+l);
		System.out.println("The double data given is : "+d);
		System.out.println("The floation data given is : "+f);
		System.out.println("The character data given is : "+c);
		System.out.println("The String data given is : "+str);
	}

}
