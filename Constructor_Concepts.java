package Static_Members;

public class Constructor_Concepts {
	
	
//	constructor is defined -> and this is the special type of non static member which is present by default
	Constructor_Concepts(){	
		System.out.println("Constructor");		
	}

	public static void main(String[] args) {
		
		System.out.println("This is the main method");
		
//		here creating the object 
		new Constructor_Concepts();
		
		System.out.println("End of the main method");
		

	}
	
//	static block
	static {
		System.out.println("Static block");
	}
	
//	non static block
	{
		System.out.println("Non-Static block");
	}

}
