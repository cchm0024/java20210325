package p12.lecture;

import java.awt.Toolkit;

public class A06Runnable {
	Thread t6 = new Thread(new Thread6());
	t6.start();
	
	for (int i = 0; i<5; i++) {
		System.out.println("띠띠링~~");
		
		Thread.sleep(1000);
	}
}

}

class Thread6 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i = 0; i< 5; i++) {
				toolkit.beep();
			}
			Thread.sleep(1000);
	
	}
}
