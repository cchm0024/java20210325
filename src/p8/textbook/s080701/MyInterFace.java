package p8.textbook.s080701;

public interface MyInterFace {
	public void method1();
	public default void method2() {
		System.out.println("myinterFace - method2");
	}
}
