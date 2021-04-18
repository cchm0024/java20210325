package p9.textbook.s090304;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	class Nested {
		String field = "Nested-field";
			void method() {
				System.out.println("Nested-method");
		}
			void print() {
				System.out.println(this.field);
				this.method();
				Outter.this.method();
			}
	}
}
