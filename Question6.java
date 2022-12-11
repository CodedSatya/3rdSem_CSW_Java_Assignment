import java.util.*;



public class Question6 {

	public static void main(String[] args) {
		
		
		String s1="Satyam Sekhar Barik";
		System.out.println("The Sentence is : "+s1);
		String array[]=s1.split(" ");
		int count =0;
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		for(int i=0;i<array.length;i++) {
			count++;
		}
		System.out.println("The Sentence has "+count+" words");

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */