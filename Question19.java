import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array Before insertion element "+Arrays.toString(array));
		System.out.println("Enter the element :");
		int ele = sc.nextInt();
		System.out.println("Enter the position : ");
		int pos=sc.nextInt();
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		if(pos>array.length) {
			System.out.println("Invalid position ");
		}
		else {
			array[pos-1]=ele;
		}
		System.out.println("Array After insertion element "+Arrays.toString(array));
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
