package Technical_Round_Practice_Questions;

public class String_Reverse {

	 public static String reverseWithoutFunction(String str) {
	        if (str == null || str.length() <= 1) {
	            return str;
	        }

	        // 1. Convert the String to a mutable Character Array
	        char[] chars = str.toCharArray();
	        
	        // 2. take two count,  one at the start (left) and one at the end (right)
	        int left = 0;
	        int right = chars.length - 1;

	        // 3. Swap characters until the pointers meet or cross
	        while (left < right) {
	            // Swap the characters at the left and right pointers
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;

	            // Move the pointers towards the center
	            left++;
	            right--;
	        }

	        // 4. Convert the character array back to a String (without using a reverse function)
	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String original = "Zoobin";
	        String reversed = reverseWithoutFunction(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed); // Output: nibooZ

	        String sentence = "Hello World";
	        String reversedSentence = reverseWithoutFunction(sentence);
	        System.out.println("Original: " + sentence);
	        System.out.println("Reversed: " + reversedSentence); // Output: dlroW olleH
	    }

}
