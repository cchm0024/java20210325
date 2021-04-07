package p6.lecyure.p4method;

public class A04ReturnKeyword {
	// return: 1. 메소드 종료
	//         2. 오른쪽에 있는 값 반환(return)
	// 오른쪽에 명시된 값을 메소드명 앞에 붙는 타입과 일치해야 함.        
	public static void main(String[] args) {
		MyClass4 c1 = new MyClass4();
		c1.method1();
		int a = c1.method2();
		String b = c1.method3();
		int[] c = c1.method4();
		int[] b = c1.method5();
		String e = c1.method6();
	}
}
