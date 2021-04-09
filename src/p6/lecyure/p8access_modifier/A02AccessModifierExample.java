package p6.lecyure.p8access_modifier;

import p6.lecyure.p8access_modifier.package1.MyClass1;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		System.out.println(o1.i);
//		System.out.println(o1.j); //private
//		System.out.println(o1.k); //default, package private
	}
}
