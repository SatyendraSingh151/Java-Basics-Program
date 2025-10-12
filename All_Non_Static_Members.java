package Static_Members;

/*Non static members -> these are object oriented members
 * 
 * Note : There is only one way to call non static members and that is by the help of the object reference variable
 * 
 * Types of non static members
 * 
 * 1 => non static variable
 * 2 => non static method
 * 3 => non static block
 * 4 => constructor
 * 
 * hirearchy of execution
 * static member -> main method -> at the time of object creation, first it will execute the non static block
 * then it will execute the constructor -> then rest of the code
 * 
 * note: non static block and constructors are going to be executed every time at the time of object creation
 * 			but when it comes to the static block this is going to be executed only once at the time of class loading
 * 
 */


public class All_Non_Static_Members {
	
//	1 -> non static variable
	String name = "Satya Yadav";
	int roll_no = 151;
	
	
//	2 -> non static methods
	public void demo() {
		System.out.println("This is the non static method in the class block.");
	}
	
	
	
//	3 -> non static block
	{
		System.out.println("\nNon static block 1");
	}
	
	{
		System.out.println("non static block 2");
	}
	
	
	
//	4 -> constructor
	All_Non_Static_Members(){
		System.out.println("\nThis is the constructor\n");
	}
	
	

	public static void main(String[] args) {
		
		
//		creating the object of the class to call the non static members and storing in the reference variable
		All_Non_Static_Members ref = new All_Non_Static_Members();
		
		System.out.println("Name : "+ref.name);
		System.out.println("Roll no : "+ref.roll_no);
		
		ref.demo();
		
		new All_Non_Static_Members();
		
		new All_Non_Static_Members();

	}
	
	
//	static block to verify
	static {
		System.out.println("Static block");
	}

}
