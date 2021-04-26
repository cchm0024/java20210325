package p13.lecture;

public class A06BoundedTypeParameter {
	Generic6<String> g1 = new Generic6<>();
	Generic6<StringBuffer> g2 = new Generic6<>();
	Generic6<StringBuilder> g3 = new Generic6<>();
	
//	Generic6<Object> g4 = new Generic6<>();
	
}
//어떤 하위 타입만 들어오게하는게 목적
//차 쉬컨스보다 상위는 안됨 오브젝트처럼
class Generic6<T extends CharSequence> {
	private T field;
	public void method() {
		char c = field.charAt(3);
	}
}
//제한된 타입파라미터 