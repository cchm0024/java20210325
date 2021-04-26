package p13.textbook.s130601;

import java.util.Arrays;

import p6.textbook.s061101.Person;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// TODO Auto-generated method stub
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends students> course) {
		// TODO Auto-generated method stub
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super worker> course) {
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Coourse<Person>("일반인과정", 5);
		personCourse.add(new Person("일반인"));
		personCOurse.add(new Person("직장인"));
	}
}
