package p10.lecture;

public class A19CustomException {
	public static void main(String[] args) throws IzeroException {
		method1();
	}
	
	private static void method1() throws IzeroException {
		int i = 0;
		
		if (i == 0) {
			throw new IzeroException("iê° 0ìëë¤");
			
		}
	}
}
