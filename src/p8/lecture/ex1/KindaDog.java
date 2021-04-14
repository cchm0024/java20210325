package p8.lecture.ex1;

public class KindaDog extends KindaDog implements Pet{

	@Override
	public void sit() {
		System.out.println("말라뮤트가 앉습니다.");
	}
}
