package Basic_Questions_1;

//	 Cheking the prime no or the composite no
public class Prime_Or_Not_Prime {

	public static void main(String[] args) {
		
//		initializing the value to the variable
		int temp=0, n = 18;
		
//		running the loop to check by which digits the given no is divisible
		for(int i=1;i<=n;i++) {
//			checking the conditions for divisible or not
			if(n%i==0) {
				temp++;
			}
		}
		if(temp==2) {
			System.out.println("Prime no");
		}
		else {
			System.out.println("Not Prime no( i.e. composite no)");
		}

	}

}
