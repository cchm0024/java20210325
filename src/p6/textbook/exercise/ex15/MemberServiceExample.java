package p6.textbook.exercise.ex15;

public class MemberServiceExample {
	public static void main(String[] args) {
		MembesSevice membesSevice = new MembesSevice();
		boolen result = membesSevice.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			membesSevice.logout("hong");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
	}
}
