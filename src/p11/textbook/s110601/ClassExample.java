package p11.textbook.s110601;

import p6.lecyure.p3constructor.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		 Car car = new Car();
		 Class clazz1 = car.getClass();
		 System.out.println(clazz1.getName());
		 System.out.println(clazz1.getName());
		 System.out.println(clazz1.getPackage().getName());
		 System.out.println();
		 
		 try(
			Class clazz2 = Class.forName("sec06.exam01_Class.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage()gatName());
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
				 
	}
}
