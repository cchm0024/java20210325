package P15.textbook.exercies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체를 저장
		list.add("jzva");
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		//2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//저장된 총 객체 수만큼 루핑
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		// 
		list.remove(2);       //2번 인덱스 객체 제어(Database) 삭제됨
		list.remove(2);       //2번 인덱스 객체(Servlet/JSP) 삭제함
		list.remove("Ibatis");
		
		for(int i = 0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}
