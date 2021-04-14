package p8.textbook.s080502;

public class Car {
	Tire fronLeftTire = new HankookTire();
	Tire fronRighttTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRighTire = new HankookTire();
	void run() {
		fronLeftTire.roll();
		fronRighttTire.roll();
		backLeftTire.roll();
		backRighTire.roll();
	}
}
