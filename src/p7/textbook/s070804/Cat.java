package p7.textbook.s070804;

public class Cat extends Animal{
	public Cat() {
		this.Kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
