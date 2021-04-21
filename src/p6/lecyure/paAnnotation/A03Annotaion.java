package p6.lecyure.paAnnotation;

import p05.textbook.s050701.Week;

public @interface A03Annotaion {
	@MyAnnotation2(value="java", attr1 = 3, attr2 = {3, 4, 5}, attr3= "java", 
			attr4 = Week.SUNDAY, attr6 = "spring"
			)
	
	
	
	public void method1() {
		
	}
}
