package p12.textbook.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calcultor calcultor = new Calcultor();
		User1 user1 = new User1();
		user1.setCalcultor(calcultor);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalcultor(calcultor);
		user2.start();
	}
}
