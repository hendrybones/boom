package com.example.boom.service;

import com.example.boom.module.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Hendry",
                        "hendrymwamburi@gmail.com",
                        LocalDate.of(1996, Month.JUNE,27),
                        21
                )
        );
    }
}
