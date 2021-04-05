package p05.lecture;

public class A08CalbyValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		method1(i);
		method1(j);
		
		String s = "java";
		String u = new String("java");
		System.out.println(System.identityHashCode(s));
		method2(s);
		System.out.println(System.identityHashCode(u));
		method2(u);
	}
	private static void method1(int a) {
		System.out.println(a);
	}
	private static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
	
	}
