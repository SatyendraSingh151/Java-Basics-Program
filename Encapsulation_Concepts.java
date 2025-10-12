package Static_Members;

//	Encapsulation concepts -> collection of methods and variables

class Details{
//	declaring the private variables
	
	private int pin;
	
	private String ac_name;
	private long ac_no;
	
	
//	here I have created the getter

	public int getPin() {
		return pin;
	}

//	here I have created the setter

	public void setPin(int pin) {
		this.pin = pin;
	}

	
	public String getAc_name() {
		return ac_name;
	}

	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}

	
	
	public long getAc_no() {
		return ac_no;
	}

	public void setAc_no(long ac_no) {
		this.ac_no = ac_no;
	}

	
	
	
}


public class Encapsulation_Concepts {

	public static void main(String[] args) {
		
		Details ref = new Details();
		
		ref.setAc_name( "Nancy Singh");
		ref.setAc_no(12345);
		ref.setPin(1104);
		
		System.out.println("Name : "+ref.getAc_name());
		System.out.println("Acc No : "+ref.getAc_no());
		System.out.println("Pin : "+ref.getPin());

	}

}
