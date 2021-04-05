package p05.textbook;

public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newString = new String[5];
		
		System.arraycopy(oldStrArray, 0, newString, 0, oldStrArray.length);
		
		for(int i=0; i<newString.length; i++) {
			System.out.println(newString[i] + ",");
		}
	}
}
