package p7.textbook.s070804;

public abstract class Animal {
	public String Kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
