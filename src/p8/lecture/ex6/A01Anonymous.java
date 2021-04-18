package p8.lecture.ex6;

public class A01Anonymous {
	public static void main(String[] args) {
		MyInterFace i1;
		i1 = new MyClass();
		
		// 클래스와 인스턴스를 한번에 만듬
		// 무명클래스(anonymous class) , 익명클래스
		
		MyInterFace i2;
		i2 = new MyInterFace() {
			@Override
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
		
		i1.method1();
		i2.method1();
		
	}
}



