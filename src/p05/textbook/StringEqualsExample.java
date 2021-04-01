package p05.textbook;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신철민";
		String StrVar2 = "신철민";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 strvar2는 참조가 같음");
		}else {
			System.out.println("strVar1 과 strvar2는 참조가 다름");
	}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 다름");		
	}
		String strVar3= new String("신철민");	
		String strVar4= new String("신철민");	
				
		if(strVar3 == strVar4)
			System.out.println("strVar3과 strVar4는 참조가 같음");
			System.out.println("strVar3과 strVar4는 참조가 다름");
					
			if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
			}
		
		}


}
