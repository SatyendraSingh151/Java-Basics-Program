package Basic_Questions_1;

//importing the Scanner class
import java.util.Scanner;

public class Check_The_Type_Of_The_Input {

	public static void main(String[] args) {
		
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the character to check : ");
		
//		taking the character to check ( for taking the char input we will use next().charAt(0) )
		char ch = sc.next().charAt(0);
		
		
//		Here ASCII value is taken to check
		if(ch>=65 && ch <=90) {
			System.out.println((char)ch +" is belonging to A - Z alphabets.");
		}
		
//		this can also be done as
//		if(ch>='A' && ch <='Z') {
//			System.out.println((char)ch +" is belonging to A - Z alphabets.");
//		}

		else if(ch>=97 && ch <=122) {
			System.out.println((char)ch +" is belonging to a - z alphabets.");
		}
		else if(ch>=48 && ch <=57) {
			System.out.println((char)ch +" is belonging to 0 - 9 numeric value");
		}
		else {
			System.out.println("Special character.");
		}
		

	}

}
