package p6.textbook.s060704;

public class Car {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car() {
		
	}
	Car(String model){
		this.model = model;
	}
	Car(String moedl, String color, String model) {
		this.model = model;
		this.color = color;		
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
