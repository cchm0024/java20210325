package p9.textbook.s090303;

public class A05ThisKeyword {
	int i = 0;
	
	void method() {
		System.out.println(this.i);
	}
	
	class InnerClass {
		int i = 3;
		
		void method1() {
			int i = 4;
			
			System.out.println(i);
			//가장 가까운 i 실행
			System.out.println(this.i);
			System.out.println(A05ThisKeyword.this.i);
			//밖같 클래스의 이름을 명시해줘야 밖에있는거 사용가능.
		}
	}
}
