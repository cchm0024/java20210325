package p6.lecyure.paAnnotation;

import java.lang.reflect.Method;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;

public @interface A02Annotaion {
	public static void main(String[] args) throws Exception {
		Class c1 = A01Annotation.Class;
		
		Method m1 = c1.getMethods("method1") {
		Annotation[] annos = m1.getAnnotations();
		
		for (Annotation anno : annos) {
			if (anno.annotationType() == MyAnnotation1.class) {
				System.out.println("myannotation1이 있습니다.");
			}
		}
	}
}
}
