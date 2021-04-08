package p6.lecyure.p6finnal;

public class A01Final {
	final static int f;
	
	static {
		f=55;
	}
	
	final static double pi = 3.1415; // 변하지 않을값에 주로 사용
	
	int a;
	final int b;
	
	A01Final() {
		this.b = 9;
	}
	public static void main(String[] args) {
		//final 변수(지역변수,파라미터, 필드)
		//값을 한 번만 할당 받을 수 있음
		
		
		final int i;
		int j;
		j = 3;
		j = 5;
		
		i = 9;
	//	i= 10; 한번만 할당 두번은 x
	}
	static void method(final int i) {
		System.out.println(i);
//		i = 3; ㅍ
	}
}
