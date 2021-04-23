package p12.textbook.s120401;

public class User1 extends Thread {
	private Calcultor calculator;
	
	public void setCalcultor(Calcultor calcultor) {
		this.setName("User1");
		this.calculator = calcultor;
	}
	
	public void run() {
		calculator.setMemory(100);
	}
	
}
