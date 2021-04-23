package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {
		
		System.out.println("실행1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //체크드 인샙션 밀리세컨드 기준
		
		System.out.println("실행2");
	}
}
