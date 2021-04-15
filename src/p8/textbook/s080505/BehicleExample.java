package p8.textbook.s080505;

public class BehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x)
		
		Bus bus = (Bus)vehicle;
		
		
		bus.run();
		bus.checkFare();
	}
}
