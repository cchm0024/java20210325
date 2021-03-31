package p04.txtbook;

public class ForprintFrom1th10Example {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------");
	//1~10 홀수만
		for(int a=1; a<=9; a+=2) {
			System.out.println(a);
		}
		
	//1~10 짝수만
		System.out.println("-------------------------");
		for (int b = 1; b<=10; b+=2) {
			System.out.println(b);
		}
	//10~1 
		System.out.println("-------------------------");
		for (int c = 10; c>=1; c--) {
			System.out.println(c);
		}

	//10~1 짝수만
		System.out.println("-------------------------");
		for (int d = 10; d>=1; d-=2) {
			System.out.println(d);
		}
	//10~1 홀수만
		System.out.println("-------------------------");
		for (int e = 9; e>=1; e-=2) {
			System.out.println(e);
		}
}
}