package p11.textbook.s110702;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "888888-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
