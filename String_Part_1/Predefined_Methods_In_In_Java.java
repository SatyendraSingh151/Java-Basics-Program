package String_Part_1;

//	 this program is going to have the predefined java methods
public class Predefined_Methods_In_In_Java {

	public static void main(String[] args) {
	
		String str = "Hello";
		
		//this is going to find the length of the given String
		System.out.println("The length of the String is = "+str.length());
		System.out.println("************************");

		// this is going to find the character at the given index from the String
		System.out.println("The character at index 0 = "+str.charAt(0));
		System.out.println("************************");

		//this is going to convert the string to the upper case
		System.out.println("Converting the String to upper case : "+str.toUpperCase());
		System.out.println("************************");

		//this is going to convert the String to the lower case
		System.out.println("Converting the String to lower case : "+str.toLowerCase());
		System.out.println("************************");

		//substring() is going to take the starting index
		System.out.println("The sub-string of the given String is = "+str.substring(3));
		System.out.println("************************");

		//substring() is going to take the starting index and the ending index
		System.out.println("The sub-string of the given String is = "+str.substring(1,4));
		System.out.println("************************");

		String str2 = "   Hey! my name is Satya         ";
		
		//trim() this method is going to remove the startin and the ending space from the String
		System.out.println("The extra space from the String is removed from the starting and the ending : "+str2.trim());
		System.out.println("************************");

		// index() this method is used to find the index of the given character
		System.out.println("This will find the index of the given character = "+str2.indexOf('S'));
		System.out.println("************************");

		System.out.println();
		System.out.println("************************");


	}

}
