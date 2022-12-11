import java.util.*;
public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String s=sc.next();
		int one=0;
		char[] cahrs =s.toCharArray();
		for(char c : cahrs) {
			/*Satyam Sekhar Barik
			 * Regd-no : 2141002032
			 * sec : CSE-U
			 * */
			String binary = Integer.toBinaryString(c);
			for(int i=0;i<binary.length();i++) {
				if(binary.charAt(i)=='1') {
					one=one+1;
				}
			}	
		}	
		System.out.println("Number of ones are : "+one);
		if(one%2==0) {
			System.out.println("T parity of the word id 0 ");
		}
		else {
			System.out.println("T parity of the word is 1");
		}
		sc.close();
	}
}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
