import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		long input=sc.nextLong();
		System.out.println("Enter the digit for frequency : ");
		int n=sc.nextInt();
//		char l=(char)n;
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		char l=Character.forDigit(n, 10);
		int count = 0;
		String s1=Long.toString(input);
		for(int i=0;i<s1.length();i++) {
			char m=s1.charAt(i);
			if(m==l) {
				count=count+1;
			}
		}
		System.out.println("The number has frequency of : "+count);
		sc.close();

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
