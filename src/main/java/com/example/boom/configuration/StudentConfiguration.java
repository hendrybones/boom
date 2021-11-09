package com.example.boom.configuration;

import com.example.boom.module.Student;
import com.example.boom.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    CommandLineRunner commandLineRunner(StudentRepo repository){
        return args -> {
            Student hendry=new Student(
                    1l,
                    "hendry",
                    "hendrymamburi56@gmail.com",
                    LocalDate.of(1996, Month.JUNE,27),
                    25);
            Student john=new Student(
                    "john",
                    "john@gmail.com",
                    LocalDate.of(1997, Month.JUNE,27),
                    25);
            repository.saveAll(
                    List.of(hendry,john)
            );
        };
    }
}
