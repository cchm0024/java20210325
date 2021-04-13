package p7.lecture.p6polymorphism.ex3;

public class A01AbstractClass {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k1 = new Tiger();
		
		KindaCat k3 = new KindaCat(); // 인스턴트를 만들수 없음
	}
}
