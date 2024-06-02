package com.wanlok.backend;

import com.wanlok.backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
    value = "student"
)
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(
        method = { RequestMethod.GET },
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Iterable<Student> get() {
        return studentRepository.findAll();
    }

    @RequestMapping(
        method = { RequestMethod.POST },
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Student post(@RequestBody Student student) {
        System.out.println("post: " + student);
        studentRepository.save(student);
        return student;
    }
}
