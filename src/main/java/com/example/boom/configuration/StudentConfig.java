package com.example.boom.configuration;

import com.example.boom.module.Student;
import com.example.boom.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
        return args -> {
            Student hendry=new Student(
                    1L,
                    "hendry",
                    "hendrymwamburi56@gmail.com",
                    LocalDate.of(1996, Month.JUNE,27),
                    25
            );
            studentRepo.save(hendry);

        };

    }

}
