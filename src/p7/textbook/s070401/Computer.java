package p7.textbook.s070401;

public class Computer extends Calculator{
	@Override
	double aareaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()실행");
		return Math.PI * r * r;
	}
}
