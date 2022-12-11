import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= {1,2,3,4,5};
		int temp[]=new int[array.length];
		System.out.println("Enter the number of rotation : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=n;i<array.length;i++) {
			temp[count]=array[i];
			count++;
		}
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		int ls=array.length-1;
		for(int j=0;j<=n-1;j--) {
			temp[(array.length-1)-j]=array[ls];
			ls=ls-1;
		}
		for(int k=0;k<temp.length;k++) {
			System.out.println(temp[k]+"");
		}
	}
	

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
