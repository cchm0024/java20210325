package p13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");                //Seting -> Object (자동타입 변환)
		String name = (String) box.get(); //Object -> String (강제타입 변환)
		
		box.set(new Apple());             //Apple -> Object (자동타입 변환)
		Apple apple = (Apple) box.get();  //Object -> Apple (강제타입 변환)
	}
}
