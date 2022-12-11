import java.util.Arrays;

public class Question18 {

	public static void main(String[] args) {
		int arr1[]= {1,2,5,6,9,16};
		int arr2[]= {3,4,7,8,10,12,15};
		System.out.println("Given array 1 is : "+Arrays.toString(arr1));
		System.out.println("Given array 2 is : "+Arrays.toString(arr2));
		int count = 0;
		int merged[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			merged[count]=arr1[i];
			count=count+1;
		}
		for(int j=0;j<arr2.length;j++) {
			merged[count]=arr2[j];
			count=count+1;
		}
		System.out.println("Merged array is : "+Arrays.toString(merged));
		
		//Using Insertion sort for sorting the merged array
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		for(int k=0;k<merged.length;k++) {
			int key=merged[k];
			int l=k-1;
			while((l>-1)&&(merged[l]>key)) {
				merged[l+1]=merged[l];
				l--;
			}
			merged[l+1]=key;
		}
		System.out.println("Sorted Merged Array is : "+Arrays.toString(merged));
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */