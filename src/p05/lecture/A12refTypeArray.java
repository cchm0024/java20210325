package p05.lecture;

public class A12refTypeArray {
 // 그림 : 07참조타입배열.pnp
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		String[] arr2 = new String[2];
		
		arr1[0] = 3;
		
		arr2[0] = "java";
		arr2[1] = "java";
		
		System.out.println(arr2[0]==arr2[1]);
	}
}
