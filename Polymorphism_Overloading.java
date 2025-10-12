package Static_Members;

/*polymorphism is of two type
 * 
 * 1 => overloading -> compile time
 * 2 => Overriding -> runtime 
 * 
 */

public class Polymorphism_Overloading {
	
//	methods overloading
	
	public void sum() {
		int a = 5;
		int b = 10;
		int sum = a+b;
		System.out.println("Sum is  : "+sum);
	}
	
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Sum is  : "+sum);
	}
	
	public void sum(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum is  : "+sum);
	}
	
	
	public void sum(int ...n) {
		int sum = 0;
		
		for( int i : n) {
			sum+=i;
		}
		
		System.out.println("Sum is  : "+sum);
	}
	

	public static void main(String[] args) {
		
		Polymorphism_Overloading ref = new Polymorphism_Overloading();
		
		ref.sum();
		
		ref.sum(4,8);
		
		ref.sum(7,7,7);
		
		ref.sum(5,5,5,5,5,5,5,5,5,5);
		

	}

}
