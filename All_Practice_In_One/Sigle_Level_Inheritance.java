package All_Practice_In_One;


//	this is the program to show the single level inheritence
//	declaring the parent class

class Parent{
	
//	declaring the non static variable
	String parentName;
	String address;
	
//	now we will create a constructor to initialize the value of the non static variable
	Parent(String parentName, String address){
		this.parentName = parentName;
		this.address = address;
	}
	
//	declaring the non static method
	public void details() {
		System.out.println("Parent purchased the land and build home.");
	}
}

//	here child class is extending the parent and also have all the properties of the parent
public class Sigle_Level_Inheritance extends Parent {

Sigle_Level_Inheritance(String parentName, String address) {
		super(parentName, address);
		
	}
//	declaring the non static method
	public void mydetail() {
		System.out.println("Child purchased the car for our comfort.");
	}
	public static void main(String[] args) {
//		 making the object of the class which has all the properties of the parent also
		Sigle_Level_Inheritance ref = new Sigle_Level_Inheritance("Ramjee Singh","Buxar, Bihar");
		
//		calling the child method (child is having all the method of the child and the parent)
		System.out.println("Parent name : "+ref.parentName+"\nAddress : "+ref.address);
		ref.details();
		ref.mydetail();
		

	}

}
