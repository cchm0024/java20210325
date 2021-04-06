package p6.lecyure.p3constructor;

public class A03ThisKeyword {
		//	this : 앞으로 만들어질 객체의 참조변수를 대신하는 키워드
		//         필드임을 명시하기 위하여
	public static void main(String[] args) {
		Tv tv1 = new Tv("samsung");
		System.out.println(tv1.name);
		Tv tv2 = new Tv("Lg");
		System.out.println(tv2.name);
	}
}
