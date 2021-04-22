package p11.textbook.s110702;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str= "안녕하세요.";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("Bytes.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("Bytes1->String: "+str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("Bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("Bytes2->String: "+str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("Bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("Bytes3->String: "+str3);
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
