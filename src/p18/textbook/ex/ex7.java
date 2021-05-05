package p18.textbook.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ex7 {
	public static void main(String[] args) throws Exception {
		String path
		= "src/p18/textbook/exercises/es07/AddLineNumberExample.java";
		
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new  BufferedReader(reader);
		
		System.out.println("입력");
		String linString = br.readLine();
		
		
		System.out.println(Number + linString);
		
		br.close();
	}
}
