package All_Practice_In_One;

//	 this is the program is to show the multilevel inheritence
//	declering the GrandParent class
class GrandParent{
	
//	declaring the non static variable
	String grandParentName ;
	
//	making the constructor to initialize the value to the non static variable
	GrandParent(String grandParentName){
		this.grandParentName = grandParentName;
	}
	
//	declaring the non static method
	public void grandParentDetail() {
		System.out.println("Grand Parent purchased the land.\n");
	}
	
}

//this is going to extend the GrandParent class here this will show multi level inheritence here
class Parent2 extends GrandParent{
	
//	declaring the non static variable
	String parentName;
	
//	declaring the constructor
	Parent2(String grandParentName, String parentName){
//		calling the GrandParent class constructor
		super(grandParentName);
		this.parentName = parentName;
	}
	
//	declaring the non static method here
	public void parentDetail() {
		System.out.println("Parent build the house on the land purchased by the Grand Parent.\n");
	}
}

//	this is going to extend the GrandParent class here this will show multi level inheritence here
public class Multi_Level_Inheritance extends Parent2{
//	declaring the non static variable
	String childName;
	
//	declaring the constructor which will pass the value
	Multi_Level_Inheritance(String grandParentName, String parentName, String childName){
		super(grandParentName,parentName);
		this.childName = childName;
		
	}
	
//	declaring a non static method
	public void childDetail() {
		System.out.println("Child purchased the car and got the house painted.\n");
	}
	
	

	public static void main(String[] args) {
		
//		making the child class object which will have all the properties of the parent and the grand parent indirectly
		Multi_Level_Inheritance ref = new Multi_Level_Inheritance("Shiv Kumar","Ramjee Singh", "Satyendra Singh");
		
//		now here all the methods and the variables will be called
		System.out.println("Grand Parent name : "+ref.grandParentName);
		ref.grandParentDetail();
		
		System.out.println("Parent name : "+ref.parentName);
		ref.parentDetail();
		
		System.out.println("Child name : "+ref.childName);
		ref.childDetail();

	}

}
