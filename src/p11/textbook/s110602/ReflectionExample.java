package p11.textbook.s110602;

import java.lang.reflect.Constructor;

public class ReflectionExample {
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("p06.textbook.s061204.mucompany.Car");
		
		System.out.println("[클래스 이름");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[생성자 정보]");
		Constructor[] constructor = clazz.getDeclaerdConstructors();
		System.out.println(cinstructor);
		Class[] parametes = constructors.getParameterTypes();
		printParame
		System.out.println(")");
	}		
