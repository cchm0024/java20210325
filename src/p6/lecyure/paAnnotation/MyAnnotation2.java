package p6.lecyure.paAnnotation;

public @interface MyAnnotation2 {

	String value(); //element
	int attr1();
	int[] attr2();
	String[] attr3();
	Week attr4();
	
	int attr5(); default 99;
	String attr6() default "java";
}
