import java.util.*;
public class Question8 {
	public static String sum(String a,String b) {
		int i=a.length();
		int j=b.length();
		int k=Math.max(i, j)+1;
		char c[]=new char[k];
		for (int l=0;k>0;l/=10) {
			if(i>0)
				l+=a.charAt(--i)-'0';
			if(j>0)
				l+=b.charAt(--j)-'0';
			c[--k]=(char)('0'+ l%10);
			
		}
		for(k=0;k<c.length-1&&c[k]=='0';k++) {
			
		}
		return new String(c,k,c.length-k);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		//User input can be exceed the integer and long range so taking input as a String
		System.out.println("Enter the first number : ");
		String input1 =sc.next();
		System.out.println("Enter the second number : ");
		String input2 = sc.next();
		String fr=sum(input1,input2);
		System.out.println("The sum is : "+fr);
		
		sc.close();

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */