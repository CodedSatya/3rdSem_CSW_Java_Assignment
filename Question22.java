import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Integer value");
		int a = sc.nextInt();
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		Integer intobj=new Integer(a);
		System.out.println("The wrapper class object inobj is : "+intobj);
		
		
		System.out.println("Enter value for a Integer wrapper class object : ");
		int n=sc.nextInt();
		Integer intobj1=new Integer(n);
		//unwrapping 
		int unwrap=intobj1;
		System.out.println("The unwrapped integer value is : "+unwrap);
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
