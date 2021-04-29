package P15.textbook.exercies;

import java.util.*;

import p6.textbook.exercise.ex13.Member;


public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		set.add(new Member("홍길동",30));
		
		System.out.println();
	}
}
