package P15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(7,3,5,1,0,2);
		List<Integer> list2 = Arrays.asList(3,2,3,5);
		
		List<Integer> marge1 = marge1(list1, list2);
		System.out.println(marge1);
	}

	private static List<Integer> marge1(List<Integer> list1, List<Integer> list2) {
		int size1 = list1.size();
		int size2 = list2.size();
		
		List<Integer> merge = new ArrayList<>();
		for (int i1 = 0, int i2 = 0; size1 || i2 < size2; i1++, i2++) {
			merge.add(list1.get(i1));
			merge.add(st2.get(i2));
		}

	}
}
