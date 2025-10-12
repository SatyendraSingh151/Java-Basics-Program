package Static_Members;

//	overriding => Is-a-relationship
class Parent{
	
//	declaring a non static method 
	public void property() {
		System.out.println("House color = red");
	}
}

public class Polymorphism_Overriding extends Parent{
	
	@Override
	public void property() {
		System.out.println("House color = green");
	}
	
//	child own property
	public void childProperty() {
		System.out.println("Child property");
	}


	public static void main(String[] args) {
		
		Polymorphism_Overriding ch = new Polymorphism_Overriding();
		ch.property();
		ch.childProperty();
		
		Parent p = new Parent();
		p.property();

	}

}
