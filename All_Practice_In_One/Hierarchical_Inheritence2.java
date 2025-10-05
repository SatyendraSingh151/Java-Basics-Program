

package All_Practice_In_One;

//	now this program is going to show the hierarchical inheritance means more than class is going to extends the Parent class

//	delcaring the parent class
class Parent3{

//	delcaring the non static variable
	void details() {
		System.out.println("This is the details of the Parent class");
	}
	
}

//now this class will extends the Parent class
class Hierarchical_Inheritence_1 extends Parent3{
	
//	now here declaring the non static method
	public void child_Details_1() {
		System.out.println("Child 1 details.");
	}
	
}

//	now this class will extends the Parent class
public class Hierarchical_Inheritence2 extends Parent3{

//	non here declaring the non static method
	public void child_Details_2() {
		System.out.println("Child 2 details.");
	}
	public static void main(String[] args) {
		
		
//		now making the object of the first child
		Hierarchical_Inheritence_1 c1 = new Hierarchical_Inheritence_1();
//		calling the child methods
		c1.details();
		c1.child_Details_1();
		
//		now making the object of the second child
		Hierarchical_Inheritence2 c2 = new Hierarchical_Inheritence2();
//		calling the childs methods
		c2.details();
		c2.child_Details_2();
		
		
		

	}

}
