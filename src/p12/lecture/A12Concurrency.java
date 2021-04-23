package p12.lecture;

public class A12Concurrency {

	static long shareValie = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i = 0; i< 100_0000; i++) {
					shareValie++;
				}
			}
		});
		t.start();
		for (int i = 0; i < 100_0000; i++) {
			shareValie++;
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(shareValie);
	}
}

