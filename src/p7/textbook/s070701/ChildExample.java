package p7.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parnet = child;
		parnet.method1();
		parnet.method2();
	//	parnet.method3();
	}
}
