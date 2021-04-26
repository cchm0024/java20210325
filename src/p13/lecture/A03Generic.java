package p13.lecture;

public class A03Generic {
	Generic3<String> g3 = new Generic3<>();
	g3.setO("java");
	String s = g3.getO();
	
	Generic3<Integer> g4 = new Generic3();
//  g4.setO
	g4.setO(999);
    int i = g4.setO(); //auto unboxing
	
	Generic3<Double> g5 = new Generic3<>();
	g5.setO(3.14);
	double d = g5.getO();

	
}

class Generic3<T> {
	private T o;
	
	public T getO() {
		return o;
	}
	
	public void setO(T o) {
		this.o = o;
	}
}
