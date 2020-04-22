package com.Spring.demo;

import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.Student;
import com.Spring.demo.Entities.University;
import com.Spring.demo.Services.InstituteService;
import com.Spring.demo.Services.StudentService;
import com.Spring.demo.Services.UniversityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.TimeZone;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		UniversityService universityService = (UniversityService)applicationContext.getBean("universityService");
		InstituteService instituteService = (InstituteService)applicationContext.getBean("instituteService");
		StudentService studentService = (StudentService)applicationContext.getBean("studentService");

		University politech = new University("Politehnika", "Stepana Bandery", "Over 9000");
		University franka = new University("Univer", "Near Ivan Franco", "Barista");

		Institute politechInstitute = new Institute("4", politech);
		Institute frankaInstitute = new Institute("2", franka);

		Student politechStudent = new Student("Ya", 19, politechInstitute);
		Student frankaStudent = new Student("Ne ya", 19, frankaInstitute);

		universityService.save(politech);
		universityService.save(franka);

		instituteService.save(politechInstitute);
		instituteService.save(frankaInstitute);

		studentService.save(politechStudent);
		studentService.save(frankaStudent);

		applicationContext.close();
	}
}
