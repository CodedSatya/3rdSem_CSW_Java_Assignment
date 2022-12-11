import java.util.*;

class Student{
	String name;
	int rn;
	int age;
	void setData(String name,int rn,int age){
		this.name=name;
		this.rn=rn;
		this.age=age;
	}
	void getData() {
		System.out.println("Name : "+name+" Regd-No : "+rn+" Age : "+age);
	}
}
public class Question20 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		
		s1.setData("Satyam", 2032, 19);
		
		s2.setData("Abinash", 9250, 19);
		
		s3.setData("Ekansh", 3540, 19);
		
		s4.setData("Yash", 2084, 19);
		
		s5.setData("Vijay", 2422, 19);
		
		s6.setData("Sarthak", 4232, 19);
		
		s7.setData("Papali", 1832, 19);
		
		Student array[]= {s1,s2,s3,s4,s5,s6,s7};
		System.out.println("Details before sorting : ");
		//Displaying
		for(int i=0;i<array.length;i++) {
			array[i].getData();
		}
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		//Insertion sort
		for(int k=0;k<array.length;k++) {
			int key=array[k].rn;
			int l=k-1;
			while((l>-1)&&(array[l].rn>key)) {
				array[l+1].rn=array[l].rn;
				l--;
			}
			array[l+1].rn=key;
		}
		System.out.println("Details after sorting : ");
		//Displaying
		for(int i=0;i<array.length;i++) {
			array[i].getData();
		}
		
	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */