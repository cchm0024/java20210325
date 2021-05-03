package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;

public class A11Writer {
	public static void main(String[] args) throws Exception{
		String file = "src/p18/lecture/output3.txt";
		Writer wt = new FileWriter(file);
		
		char c = '가';
		
		wt.write(c);
		
		wt.close();
		
		System.out.println("출력 완료");
	}
}
