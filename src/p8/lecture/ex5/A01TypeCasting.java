package p8.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.back();
		d1.sit();
		d1.pull();
		
		Pet p1 =d1;
//		p1.back(); x
		p1.sit();	
//		p1.pull(); x
		
		SledDog s1 = d1;
//		s1.back();
//		s1.sit();
		s1.pull();
		
		kindaDog k1 = d1;
		k1.back();
//		k1.sit();
//		k1.pull();
		
		Malamute d2 = (Malamute) k1;
		
		d2.back();
		d2.sit();
		d2.pull();
		
		Wolf w1 = (Wolf) k1;
		w1.back();
		
		System.out.println("프로그램종료");
	}
}
