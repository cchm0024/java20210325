package p6.textbook.exercise.ex19;

public class Account {

		private int balance;
		public static final int MIN_BALANCE = 0;
		public static final int MAX_BALANCE = 1000000;

		public void setBal(int balance){
			if(balance>=MIN_BALANCE  && balance <= MAX_BALANCE){
				this.balance = balance;
			}
		}

		public void getBal(){
			return this.balance;
		}
}