package Basic_Questions_1;

//	importing the Scanner class
import java.util.Scanner;

public class Pass_Or_Fail_Based_On_Grade {
	
//	This is going to check the condition based on the grade of the student
	public static void main(String[] args) {
		
//		making the object of the Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give the grade of the student : ");
		
//		taking the grade of the student ( for taking the char input we will use next().charAt(0) )
		char grade = sc.next().charAt(0) ;
		
//		checking the condition
		if(grade == 'A') {
			System.out.println("First Division");
		}
		else if(grade == 'B') {
			System.out.println("Second Division");
		}
		else if(grade == 'C') {
			System.out.println("Third Division");
		}
		else if(grade == 'D') {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Grade");
		}
		

	}

}
