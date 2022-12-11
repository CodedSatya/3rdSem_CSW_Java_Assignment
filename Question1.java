
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		int x=sc.nextInt();
		int count=0;
		while (x>0) {
			count++;
			x>>=1;
		}
		System.out.println("Maximun bit number :"+count);
		sc.close();
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */