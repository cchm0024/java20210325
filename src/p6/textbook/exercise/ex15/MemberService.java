package p6.textbook.exercise.ex15;

public class MemberService {
	public boolean login(String id, String password){

		boolean res;

		if(id == “hong” && password == “12345”){
		res = true;
		} else {
		res = false; }
		return res;
		}
		public void logout(String id){
		System.out.println("로그아웃되었습니다.");
		}
		}

