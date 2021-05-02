package P15.textbook.exercies;

import java.util.HashMap;
import java.util.Map;

public class ex9 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("while", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String,Integer> entry : entrySet) {
			if(getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();
		System.out.println("평균점수:" + avgScore);
		
		System.out.println("최고 점수:" + maxScore);
		System.out.println("최고 점수를 받은 아이디" + name);
	}
}
