package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A14TryWithResources {
	public static void main(String[] args) {
		String path = "src/p10/lecture/A13TryWithResources.java";
		FileInputStream fis = null;
		try(
			FileInputStream fis = new FileInputStream(path);
				){
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			fis.close();
		}
	}
}
