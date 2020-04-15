package com.Spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);


		StudentDao studentDao = (StudentDao) applicationContext.getBean("PseudoDataBase");

		Student student1 = new Student(1, "Ivan", 20);
		Student student2 = new Student(2, "Roman", 21);
		Student student3 = new Student(3, "Islam", 24);
		Student student4 = new Student(4, "Pahan", 22);

		studentDao.addStudent(student1);
		studentDao.addStudent(student2);
		studentDao.addStudent(student3);
		studentDao.addStudent(student4);

		System.out.println(studentDao.students);

		studentDao.removeStudent(student1);
		studentDao.removeStudent(student2);

		System.out.println(studentDao.students);

		applicationContext.close();
	}
}
