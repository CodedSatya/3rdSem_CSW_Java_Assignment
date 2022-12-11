
public class Question26 {
	public static String baseConversion(String number, int sBase,int dBase) {
		return Integer.toString(Integer.parseInt(number,sBase),dBase);
	}
	public static void main(String[] args) {
		String number = "555";
		int sBase = 8;
		int dBase = 10;
		/*Satyam Sekhar Barik
		 * Regd-no : 2141002032
		 * sec : CSE-U
		 * */
		System.out.println("Octal to Decimal : "+baseConversion(number,sBase,dBase));
		dBase=16;
		System.out.println("Octal to Hex : "+ baseConversion(number,sBase,dBase));

	}

}
/*Satyam Sekhar Barik
 * Regd-no : 2141002032
 * sec : CSE-U
 * */