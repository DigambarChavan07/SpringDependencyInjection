package org.prince.in.client;

import org.prince.in.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student student = context.getBean("student", Student.class);
		
		System.out.println(student.toString());
		
	}
}
