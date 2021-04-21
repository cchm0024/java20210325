package p11.lecture.classClass;

import java.lang.reflect.Constructor;

public class A01Class {
	public static void main(String[] args) throws Exception {
		MyClass o1= new MyClass();
		
		Class c1 = Class.forName("p11.lecture.classClass.MyClass");
		
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		System.out.println(fields[0].getName());
		System.out.println(fields[1].getName());
		
		
		System.out.println(fields.length);
		
		Constructor [] constructors = c1.getDeclaredConstructors();

		System.out.println(constructors);
		
		Method[] methids[]
		
		System.out.println(methods.lenght);
		System.out.println(methods[0].getName());
		System.out.println(methods[1].getName());
}

Class MyClass {
	private int filed1;
	private int field2;
	
	MyClass() {
		
	}
	MyClass(int param1) {
		
	}
	public void method1() {
		
	}
	public void method2() {
		
	}
}
