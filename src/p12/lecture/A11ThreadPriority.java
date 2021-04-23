package p12.lecture;

public class A11ThreadPriority {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
		Thread t = new Thread(new Thread11());
		if ( i==0) {
		t.setPriority(10); // 우선순위 설정 10이 가장 높은 우선순위
		} else {
		t.setPriority(1);
		}
		t.start();
	}
	}
}

class Thread11 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for(long i = 0; i < 100_0000_0000L; i++) {
		
	}
	System.out.println(Thread.currentThread().getName());
	}
}