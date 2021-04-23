package p12.lecture;

public class A14SynchronizedMethod {
	public static void main(String[] args) {
		Thread14 t1 = new Thread14();
		Thread14 t2 = new Thread14();
		
		Box box = new Box();
		t1.box = box;
		t2.box = box;
		
		t1.start();
		t2.start();
		
		
	}
}

class Thread14 extends Thread {
	public Box box;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		box.execute();
	}
}

class Box {
	public synchronized void execute() {
		System.out.println("method start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method end");
	}
}
//하나씩 실행을 보장하려면 synchronized를 사용
//ex ) start end start end