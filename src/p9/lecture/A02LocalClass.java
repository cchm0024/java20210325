package p9.lecture;

public class A02LocalClass {
	
	class InnerClass {
		
	}
	// static nested class
	static class NestedClass {
		
	}
	
	void method1() {
		//local class
		class LocalClass {
			//필드
			//생성자
			//메소드
		}
		LocalClass o1 = new LocalClass();
	}
}
