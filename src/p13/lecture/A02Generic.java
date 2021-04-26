package p13.lecture;
	
public class A02Generic {
	//generic이 없던 시절...
	public static void main(String[] args) {
		Generic2 g2 = new Generic2();
		g2.set0("java");
		String s = (String) g2.get0();
		System.out.println(s);
		
		g2.set0(22); //int - > Integer  auto box
		Integer i = (Integer) g2.get0();
		System.out.println(i);
		
		g2.set0(3.14);
		Integer d = (Integer) g2.get0();
				
	}
	
}

class Generic2 {
	private Object o;
	
	public void set0(Object o) {
		this.o = o;
	}
	
	public Object get0() {
		return o;
	}
}
