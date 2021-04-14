package p8.textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.fronLeftTire = new KumhoTire();
		myCar.fronRighttTire = new KumhoTire();
		
		myCar.run();
	}
}
