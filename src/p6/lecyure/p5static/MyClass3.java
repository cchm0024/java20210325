package p6.lecyure.p5static;

public class MyClass3 {
	int i;
	static int j;
	static void method1() {
		System.out.println("method1()");
//		this.method3();
		method3();
		// Static member에서 instance member에 접근 불가능
		//	method4();
		System.out.println(j);
//		System.out.println(i);
	}
	static void method3() {
		System.out.println("method3()");
	}
	
	void method2() {
		System.out.println("method2()");
		this.method4();
		method3();
	}
	void method4() {
		System.out.println("method4()");
	}
}
