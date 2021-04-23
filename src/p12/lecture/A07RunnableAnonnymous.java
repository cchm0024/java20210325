package p12.lecture;

public class A07RunnableAnonnymous {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread 생성");
			}
		});
	}
}
