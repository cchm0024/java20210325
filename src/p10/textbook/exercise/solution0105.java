package p10.textbook.exercise;

public class solution0105 {
	//1번문제 
	//답 4
	// api인셉션 목록
	
	
	public static void main(String[] args) {
		//2번문제
		//답 3
		//무조건 실행된다
		
		try {
			int i = 0;
			int j = 5/i;
			return;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally black");
		}
		
	}
	// 3번 문제
	// 답 : 4번
	
	
	
	// 5번 문제
	// 답 : 3번
	// 상위 클래스 먼저 사용 금지
	public void method2() {
		method1();
	}
	
	public void method1() throws NumberFormatException, ClassNotFoundException
}
