package Technical_Round_Practice_Questions;

import java.util.Scanner;

public class Vowels_and_Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give the String to count the vowels and the consonents : ");
		String str = sc.nextLine();

		char ch[] = str.toCharArray(); 
		
//		also finding the reverse of the string
		char rev[] = new char[ch.length];
		
		for(int i=0; i<ch.length; i++) {
			rev[i] = ch[ch.length-(i+1)];
		}
		
//		now printing the reverse string 
		String reversedString = new String(rev);
		System.out.println("The reverse string is : "+ reversedString);
		
		
//		now calculating the vowels and the consonents in the String 
		int vowels_count=0;
		System.out.println("The vowels are : ");
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'a' || ch[i] =='e' || ch[i] == 'i' || ch[i] =='o' || ch[i] == 'u') {
				vowels_count ++;
				System.out.print(ch[i]+" ");
				
			}
		}
		System.out.println("\nThe total consonents are : "+(ch.length - vowels_count));
		

	}

}
