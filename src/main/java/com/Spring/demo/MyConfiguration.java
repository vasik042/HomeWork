package com.Spring.demo;

import com.Spring.demo.Daos.InstituteDao;
import com.Spring.demo.Daos.UniversityDao;
import com.Spring.demo.Entities.Institute;
import com.Spring.demo.Entities.University;
import com.Spring.demo.Services.InstituteService;
import com.Spring.demo.Services.UniversityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

    @Bean
    public UniversityDao createUniversityDao(){
        return new UniversityDao();
    }

    @Bean
    @Scope("singleton")
    public UniversityService createUniversityService(){
        return new UniversityService();
    }

    @Bean
    public InstituteDao createInstituteDao(){
        return new InstituteDao();
    }

    @Bean
    @Scope("singleton")
    public InstituteService createInstituteService(){
        return new InstituteService();
    }
}
