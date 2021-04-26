package p13.textbook.exercies.ex2;

public class ContainerExampl {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> cotainer2 = new Container<Integer>();
		cotainer2.set(6);
		int value = cotainer2.get();
	}
}

