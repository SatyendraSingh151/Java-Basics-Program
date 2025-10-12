package Static_Members;

public class Constructor_Topics {
//	constructor overloading concepts
	
//	no args constructor
	Constructor_Topics(){
		System.out.println("This is the no parameterized constructor");
	}
	
	
//	1 argument constructor
	Constructor_Topics(String name){ //here is formal arguments
		System.out.println("Name : "+name);
	}
	
//	2 argument constructor
	Constructor_Topics(String name, int roll_no){
		System.out.println("Name : "+name+"\nRoll no : "+roll_no);
	}
	
	Constructor_Topics(int roll_no, String name){
		System.out.println("Name : "+name+"\nRoll no : "+roll_no);
	}
	

	public static void main(String[] args) {
		
		
//		creating the object
	
		
		new Constructor_Topics("Satya",151); //actual arguments

	}

}
