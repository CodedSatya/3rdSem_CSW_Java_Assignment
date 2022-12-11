import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String : ");
//		String s1=sc.next();
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		String s1="Satyam sekhar barik";
		String sens[]=s1.split(" ");
		System.out.println("The sentence is :");
		for(int i=0;i<sens.length;i++) {
			System.out.print(sens[i]+" ");
		}
		System.out.println("   ");
		System.out.println("The reversed String : ");
		for(int i=sens.length-1;i>=0;i--) {
			System.out.print(sens[i]+" ");
		}
		sc.close();
	}
}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
