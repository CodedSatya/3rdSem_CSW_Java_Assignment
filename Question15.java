import java.util.*;
public class Question15 {
	
	static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array[]= {1,2,3,4,5,6,7,8,9};
		int primeNumber=0;
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		for(int i=0;i<array.length;i++) {
			if(isPrime(array[i])==true) {
				primeNumber=primeNumber+1;
			}
		}
		System.out.println("Number of prime numbers are :"+primeNumber);
		sc.close();

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */