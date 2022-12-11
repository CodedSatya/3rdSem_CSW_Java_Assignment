import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter x :");
		int x=sc.nextInt();
		System.out.println("Enter y :");
		int y = sc.nextInt();
		int result=0;
		//Here I am using Russian Peasant method
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		while(y>=1) {
			if(y%2==0) {
				//for b is even
				x=x<<1;
				y=y>>1;
			}
			else {
				//for b is odd
				result+=x;
				x=x<<1;
				y=y>>1;
				
			}
		}
		System.out.println("The multiplied value is : "+result);
		
		
		sc.close();
	}
}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
