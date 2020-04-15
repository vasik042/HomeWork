package com.Spring.demo;

import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.Student;
import com.Spring.demo.Entities.University;
import com.Spring.demo.Services.InstituteService;
import com.Spring.demo.Services.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		UniversityService universityService = (UniversityService)applicationContext.getBean("createUniversityService");
		InstituteService instituteService = (InstituteService)applicationContext.getBean("createInstituteService");

		University politech = new University("Politehnika", "Stepana Bandery", "Over 9000");
		University franka = new University("Univer", "Near Ivan Franco", "Barista");

		universityService.addInstitute(politech, new Institute("Chemical"));
		universityService.addInstitute(politech, new Institute("Architecture"));

		universityService.addInstitute(franka, new Institute("I don't know"));
		universityService.addInstitute(franka, new Institute("Does it matters?"));

		instituteService.addStudent(universityService.getAllInstitutes(politech).get(0), new Student(19, "19", 19));
		instituteService.addStudent(universityService.getAllInstitutes(politech).get(0), new Student(20, "20", 20));
		instituteService.addStudent(universityService.getAllInstitutes(politech).get(1), new Student(21, "21", 21));
		instituteService.addStudent(universityService.getAllInstitutes(politech).get(1), new Student(22, "22", 22));

		instituteService.addStudent(universityService.getAllInstitutes(franka).get(0), new Student(23, "23", 23));
		instituteService.addStudent(universityService.getAllInstitutes(franka).get(0), new Student(24, "24", 24));
		instituteService.addStudent(universityService.getAllInstitutes(franka).get(1), new Student(25, "25", 25));
		instituteService.addStudent(universityService.getAllInstitutes(franka).get(1), new Student(26, "26", 26));

		System.out.println(politech);
		System.out.println(franka);

		applicationContext.close();
	}
}
