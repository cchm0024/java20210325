package p02.textbook;

public class VariableScopeExapmle {
	public static void main(String[] arge) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
//	int v3 = v1 + v2 + 5; //v2변수를 사용할 수 없기 떄문에 컴파일 에러가 생김
	}
}
