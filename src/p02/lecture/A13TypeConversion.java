package p02.lecture;

public class A13TypeConversion {
	public static void main(String[] args) {
		// int : 4byte (32bit)
		// float : 4byte (32bit)
		
		// float 저장법
		// 부호비트1
		// 지수비트8
		// 가수비트23
		// 0000 0000 0000 0000 0000 0000 0000 0000
		
		
		int intVar1 = 66977791;
		float floatVar1 =  intVar1;
		
		System.out.println(floatVar1);
		
		//double 저장법 (8byte)
		//부호지수 1
		//지수비트 11
		//가수비트 52
		
		double doubleVar1 = intVar1; 
		System.out.println(doubleVar1);
	}
}
