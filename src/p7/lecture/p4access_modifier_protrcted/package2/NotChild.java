package p7.lecture.p4access_modifier_protrcted.package2;

import p7.lecture.p4access_modifier_protrcted.package1.Parent;

public class NotChild {
	public void notChildMethod() {
		Parent p = new Parent();
		p.publicMethod(); // ok
//		p.protectedMethod(); // not ok
//		p.defaultMethod(); // not ok
//		p.privateMethod(); // not ok
	}
}
