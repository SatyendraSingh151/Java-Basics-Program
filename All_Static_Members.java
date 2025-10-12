package Static_Members;


/* static memberes are class oriented members
 * 
 * Total numbres of the static members
 * 
 *  1 => static block
 *  2 => static variable
 *  3 => static method
 * 
 * 
 * there are 3 ways by which we can the static members, they are
 *  1 -> directly by their name
 *  2 -> by class name as reference
 *  3 -> by creating the object reference
 *  
 *  the hierarchy of execution
 *  static block -> main method -> constructor at the time of object creation
 */
public class All_Static_Members {
	
//	static variable
	static String name = "Nancy";
	
//	static method 
	public static void demo() {
		System.out.println("This is the static  method in the class block.");
	}
	
//	declaring a constructor to cross verify for the object creation
	All_Static_Members (){
		System.out.println("\nThis is the constructor.\n");
	}
	
//	static block
	static {
		System.out.println("This is the static block 2.\n");
	}

	public static void main(String[] args) {
		
		
//		1 -> calling directly by name
		System.out.println("Name : "+name);
		demo();
		
//		2 -> by class name as a reference
		System.out.println("\nName : "+All_Static_Members.name);
		All_Static_Members.demo();
		
//		3 -> by making the object of the class name and using its reference
		All_Static_Members ref = new All_Static_Members();  //note : at the time of the object creation each time the constructor is going to be executed first then it comes back to it.
		System.out.println("\nName : "+ref.name);
		ref.demo();
		
		new All_Static_Members();
		
		new All_Static_Members();
		
		

	}

//	static block
	static {
		System.out.println("This is the static block 1.\n");
	}
	
}
