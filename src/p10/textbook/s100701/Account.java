package p10.textbook.s100701;

public class Account {
	private long balcnce;
	
	public Account() {}
	
	public long getBalance() {
		return balcnce;
	}
	public void deposit(int money) {
		balcnce += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:" +( money-balance)+" 모자람");
		}	
		balcnce -= money;
	}
}
