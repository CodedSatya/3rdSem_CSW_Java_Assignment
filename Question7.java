import java.util.*;
class DOB{
	int date;
	String month;
	int year;
	DOB(int date,String month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
}
public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter DOB");
		DOB dob=new DOB(sc.nextInt(),sc.next(),sc.nextInt());
		char p=name.charAt(0);
		char s=name.charAt(1);
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		char w=dob.month.charAt(0);
		char d=dob.month.charAt(1);
		StringBuilder password=new StringBuilder();
		password.append(p);
		password.append(s);
		password.append(w);
		password.append(d);
		
		System.out.println("The generated password is :" +password);
		
		
		sc.close();

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */