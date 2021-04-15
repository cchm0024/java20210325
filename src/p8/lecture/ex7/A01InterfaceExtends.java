package p8.lecture.ex7;

public class A01InterfaceExtends {
	public static void main(String[] args) {
		MyInterFace2 i2 = new MyInterFace2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
}

interface MyInterFace1 {
	void method1();
}

interface MyInterFace2 extends MyInterFace1 {
	void method2();
}