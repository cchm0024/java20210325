package p05.lecture;

public class A04ReferenceType4 {
	
	// 그림 : 03.참조타입.pug
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		String s = new String("java");
		String t = s;
		
		System.out.println(i == j);
		System.out.println(s == t);
	}
}
