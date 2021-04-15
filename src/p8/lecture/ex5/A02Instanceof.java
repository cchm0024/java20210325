package p8.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		kindaDog d1 = new Malamute();
		
		System.out.println(d1 instanceof kindaDog);
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof SledDog);
		System.out.println(d1 instanceof Wolf);
		
		//True 가 나오면 강제형변환 가능
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog)d1;
		Wolf w1 = (Wolf)d1;
		
		System.out.println("프로그램종료");
	}
}
