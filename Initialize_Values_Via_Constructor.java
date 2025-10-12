package Static_Members;

public class Initialize_Values_Via_Constructor {
	
	String name;
	int rollno;
	
	 Initialize_Values_Via_Constructor(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		
		Initialize_Values_Via_Constructor s1 = new Initialize_Values_Via_Constructor("nancy",97);

		Initialize_Values_Via_Constructor s2 = new Initialize_Values_Via_Constructor("satya",151);
		
//		fetch the values to verify
		System.out.println("Name : "+s1.name);
		System.out.println("Roll no : "+s1.rollno+"\n");
		
		System.out.println("Name : "+s2.name);
		System.out.println("Roll no : "+s2.rollno+"\n");
	}

}
