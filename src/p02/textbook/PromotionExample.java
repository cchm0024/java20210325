package p02.textbook;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue =  byteValue; // int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; //int <- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // long <- int
		System.out.println(intValue);
		
		intValue = 200;
		double doublValue = intValue; // diuble <- int
		System.out.println(doublValue);
}
}
