import java.util.*; 
public class Question3 {

	public static void main(String[] args) {
		//Initializing Scanner
		Scanner sc=new Scanner(System.in);
		//Creating a array of long elements as our input may be a 64-bit Integer
		long arr[]= new long[64];
		System.out.println("Enter a 64-bit integer :");
		//Taking the input as a String so that no error occurs 
		String s1=sc.next();
		//Convering the string input to long so that we could implement it 
		long input =Long.parseLong(s1);
		//Creating loop for converting the number to bits and storing in a array
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		for(int n=0;n<arr.length;n++) {
			long bit=input%2;
			input=input/2;
			arr[n]=bit;
		}
		System.out.println("Binary representaion before swap :");
		for(int m=0;m<arr.length;m++) {
			System.out.print(arr[m]+",");
		}
		
		
		//Code for Swapping bits in the 64-bit Integer
		
		System.out.println("Enter ith position :");
		int i=sc.nextInt();
		System.out.println("Enter jth position :");
		int j = sc.nextInt();
		
		long key;
		//Swaping the bits present in ith position and jth position
		key=arr[i];
		arr[i]=arr[j];
		arr[j]=key;
		System.out.println("Binary representatin after the swap :");
		for(int v=0;v<arr.length;v++) {
			System.out.print(arr[v]+",");
		}
		
		sc.close();
		
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
