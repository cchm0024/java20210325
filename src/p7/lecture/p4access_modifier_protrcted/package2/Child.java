package p7.lecture.p4access_modifier_protrcted.package2;

import p7.lecture.p4access_modifier_protrcted.package1.Parent;

public class Child extends Parent {
	
	public void childMethod() {
		publicMethod(); // ok
		protectedMethod(); // ok
//		defaultMethod(); // not ok
//		privateMethod(); // not ok
	}
}
