package com.Spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean (name ="PseudoDataBase")
    public StudentDao createStudentDao(){
        return new StudentDao();
    }
}
