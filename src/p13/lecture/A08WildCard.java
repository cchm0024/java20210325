package p13.lecture;

public class A08WildCard {

		public static void main(String[] args) {
			putBox(new Box8<MyClass8>());
			putBox(new Box8<Object>());
			
			getbox(new Box8<MyClass8>());
			getBox(new Bo);
		}
		
		private static void putBox(Box8<? super MyClass8> box) {
			// TODO Auto-generated method stub
			box.setField(new MyClass8());
		}
		
		public static void getBox(Box8<? extends MyClass8> box) {
			MyClass8 o1 = box.getField();
		}
		
		public static void allBox(Box8<?> box) {
			Object od = box.getField();
			box.setField(new Object());
		}
}

class Box8<T> {
	private T field;
	
	public void setField(T field) {
		this.field = field;
	}
	
	public T getField() {
		return field;
	}
}

// class Parent8 {}
// class Child8 extends Parent8{}

class MyClass8 {} 
class Child8 extends MyClass8{}