package p12.textbook.s120401;

public class Calcultor {
	private int memory;
	
	public int getMonort() {
		return memory;
	}
	
	public synchronized void setMemory(int memory ) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
