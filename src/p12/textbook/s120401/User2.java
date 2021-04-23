package p12.textbook.s120401;

public class User2 extends Thread {
	private Calcultor calculator;
	
	public void setCalcultor(Calcultor calcultor) {
		this.setName("User2");
		this.calculator = calcultor;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	
}


