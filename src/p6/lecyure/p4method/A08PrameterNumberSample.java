package p6.lecyure.p4method;

public class A08PrameterNumberSample {
	public static void main(String[] args) {
		MyClass8 o1 = new MyClass8();
		int m = o1.max(); //0
		System.out.println(m);
		
		m = o1.max(1);
		System.out.println(m);
		
		m = o1.max(99, 77, 100);
		System.out.println();
		
		m = o1.max(new int[] {6,5,7,2,4});
		System.out.println(m);
}
}
