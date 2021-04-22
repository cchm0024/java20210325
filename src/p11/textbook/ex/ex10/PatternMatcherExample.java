package p11.textbook.ex.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		
		// 알파벳시작, 숫자알파벳, 총8~12자
		
		String regExp = "\\w\\[a~zA~Z1~9]";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("ID로 사용할수 있습니다." );
		} else {
			System.out.println("ID로 사용할수 없습니다.");
		}
	}
}
