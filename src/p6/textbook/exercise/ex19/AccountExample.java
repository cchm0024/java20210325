package p6.textbook.exercise.ex19;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setbalance(10000);
		System.out.println("현재 잔고: "+ account.getbalance());
		
		account.setbalance(-100);
		System.out.println("현재 잔고: "+ account.getbalance());
		
		account.setbalance(200000);
		System.out.println("현재 잔고: "+ account.getbalance());
		
		account.setbalance(300000);
		System.out.println("현재 잔고: "+ account.getbalance());
	}
}
