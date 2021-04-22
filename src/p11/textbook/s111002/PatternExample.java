package p11.textbook.s111002;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String rgbExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(rgbExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		rgbExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "ange1@navercom";
		result = Pattern.matches(rgbExp, data);
		if (result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
