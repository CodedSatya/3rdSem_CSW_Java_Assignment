import java.util.*;
class Num{
	Scanner sc = new Scanner(System.in);
	int array[];
	int count=0;
	void setData(int n) {
		array=new int[n];
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter element : ");
			array[i]=sc.nextInt();
		}
	}
	void getData(){
		System.out.print("The array is : [");
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+",");
		}
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		System.out.println("]");
	}
	void reverse() {
		int temp[]=new int[array.length];
		for(int k=0;k<temp.length;k++) {
			temp[k]=array[(array.length-1)-k];
		}
		for(int m=0;m<array.length;m++) {
			array[m]=temp[m];
		}
	}
}
public class Question21 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Num n1= new Num();
		System.out.println("Enter the array size : ");
		int size=sc.nextInt();
		n1.setData(size);
		sc.close();
		n1.getData();
		n1.reverse();
		System.out.println("The reversed array is : ");
		n1.getData();
	}
}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
