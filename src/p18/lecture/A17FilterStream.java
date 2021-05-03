package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream {
	public static void main(String[] args) throws Exception {
		// InputStream -> reader
		
		String file = "src/p18/lecture/A17FilterStream.java";
		InputStream is = getInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		
		int b = 0;
		
		while ((b = is.read()) != -1) {
			System.out.print((char)b);
		}
		
		isr.close();
		is.close();
	}
	public static InputStream getInputStream(String file) throws Exception{
		return new FileInputStream(file);
		
	}

}
