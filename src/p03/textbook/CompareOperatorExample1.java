package p03.textbook;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean restlt2 = (num1 != num2);
		boolean restlt3 = (num1 <= num2);
		System.out.println("restlt1= " + result1);
		System.out.println("restlt2= " + restlt2);
		System.out.println("restlt3= " + restlt3);
		
		char char1 = 'A';
		char char2 = 'b';
		boolean result4 = (char1 < char2);
		System.out.println("srsult4= " + result4);
	}
}
