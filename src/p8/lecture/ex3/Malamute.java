package p8.lecture.ex3;

public class Malamute implements pet,SledDog {

	@Override
	public void pull() {
		System.out.println("썰매를 끕니다.");
		
	}

	@Override
	public void sit() {
		System.out.println("앉습니다.");
		
	}

}
