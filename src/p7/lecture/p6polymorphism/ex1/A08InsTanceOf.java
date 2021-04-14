package p7.lecture.p6polymorphism.ex1;

public class A08InsTanceOf {
	public static void main(String[] args) {
		// instanceof : 결과 - boolean
		// 왼쪽항 참조변수, 오른쪽함 Type
		// 참조변수가 가리키는 인스턴스가 오른쪽함 Type이면 true
		// 그렇지 않으면 false
		
		KindaCat k1 = new Tiger();
		System.out.println(k1 instanceof Tiger);
		System.out.println(k1 instanceof KindaCat);
		System.out.println(k1 instanceof Cat);
		
		System.out.println();
		KindaCat k2 = new KindaCat();
		System.out.println(k2 instanceof Tiger);
		System.out.println(k2 instanceof Tiger);
		System.out.println(k2 instanceof Tiger);
		
		Tiger t1 = (Tiger) k1;
		Cat c1 = (Cat)k1;
		
		System.out.println("프로그램종료...");
	}
}