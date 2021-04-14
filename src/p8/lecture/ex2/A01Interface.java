package p8.lecture.ex2;

public interface A01Interface {
	public static void main(String[] args) {
		System.out.println(MYInterFace.MY_FIELD1);
		System.out.println(MYInterFace.My_Field2);
		
		MYInterFace.staticMethod1();
		MYInterFace.staticMethod2();
		
		MyClass c1 = new MyClass();
		c1.method1();
		c1.method2();
		
		c1.defaultMethod1();
		c1.defaultMethod2();
	}
}
