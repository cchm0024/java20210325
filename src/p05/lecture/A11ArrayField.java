package p05.lecture;

public class A11ArrayField {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		arr1[0] = 10;
		arr1[1] = 11;
		arr1[2] = 12;
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		arr2[3] = 400;
		arr2[4] = 500;
		
		System.out.println("arr 출력");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		
		System.out.println("arr2 출력");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		
		System.out.println("arr1 출력을 (for)");
		for (int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("arr2 출력을 (for");
		for(int a = 0; a<arr2.length; a++) {
			System.out.println(arr2[a]);
		}
	}
}
