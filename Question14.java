import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int array[]= {2,3,4,2,3,5,6,4,3,2,3,};
		for(int i=0;i<array.length;i++) {
			int count=0;
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count=count+1;
					
//					array[j]=0;
					
				}
				
			}
			System.out.println(array[i]+"has a frequency of "+count+" times.");
		}
		
/*        
 *             /\                                                                                                        --------                    
 *            /  \                                                                                                      /       / 
 *           /    \                                                                                                    /      /   
 *          /      \                                                                                                  /      /
 *         /        \                                                                                                /     /   /\ 
 * 	       ----------                                                                                               /     /  /   \
 *         ---------           -----------        ------         ---------------  ---      ---       ------        /      \/      \ 
 *	   /| |         | |\      |  ________/       /  /\  \       |               | \  \    /  /      /  /\  \       \____/---       |  
 *    / | |         | | \     | |               /  /  \  \       -----|   |-----   \  \  /  /      /  /  \  \              /      /
 *   /  | |         | |  \    |  --------      /  /    \  \           |   |         \  \/  /      /  /    \  \            /      /
 *   \  | |         | |  /    |________  |    /  /      \  \          |   |          \    /      /  /      \  \          /     /
 *    \ | |         | | /             |  |   /  /--------\  \         |   |           /  /      /  /--------\  \        /    /
 *     \| |         | |/      --------   |  /  /__________\  \        |   |          /  /      /  /__________\  \      /   /
 *         ---------         /___________| /__/            \__\        ---          /__/      /__/            \__\    /  /
 *         ----------                                                                                                / /
 *         \        /                                                                                               //    
 *          \      /                                                                                               /         
 *           \    /
 *            \  /
 *             \/
 *       
 * */		
		
		
		sc.close();
		

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */
