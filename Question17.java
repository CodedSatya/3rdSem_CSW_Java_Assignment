import java.util.*;

public class Question17 {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,4,4,5,5,6,6,7,7,7,7,8,8,8,9,9,};
		System.out.println("Before duplicate removal :"+Arrays.toString(array));
		ArrayList<Integer> array_new=new ArrayList<Integer>();
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					array[j]=0;
					
				}
				
			}
			if(array[i]!=0) {
				array_new.add(array[i]);
			}
		}
		
			
		
		System.out.println("After duplicate removal :"+array_new);

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */