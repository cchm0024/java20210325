package p9.lecture;

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
			//가장가까운 것 사용
			System.out.println(this.i);
			System.out.println(A05ThisKeyword.this.i);
			//밖같 클래스의 이름을 명시해줘야 밖에있는거 사용가능.
		}
	}
}





