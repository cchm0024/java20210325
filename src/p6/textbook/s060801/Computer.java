package p6.textbook.s060801;

public class Computer {
	int sum (int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
	int sum2 (int...values) {
		int sum2 = 0;
		for(int i = 0; i < values.length; i++) {
			sum2 += values[i];
		}
		return sum2;
}
}
