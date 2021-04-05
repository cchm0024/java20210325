package p05.textbook.EXercise;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			switch(studentNum) {
			case 1:
				//학생수
			case 2:
				
			case 3:
				// 점수 리스트
				for( int i = 0; i< scores.length; i++) {
					System.out.println("");
				}
			case 4:
				
			case 5: 
				//종료
				run = false;
				break;
			}
		System.out.println("프로그램 종료");
	}
}
