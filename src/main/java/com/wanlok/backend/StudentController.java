package com.wanlok.backend;

import com.wanlok.backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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
        value = "/{id}",
        method = { RequestMethod.GET },
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Student getStudent(@PathVariable("id") Integer student_id) {
        Optional<Student> optional = studentRepository.findById(student_id);
        Student student = null;
        if (optional.isPresent()) {
            student = optional.get();
        }
        return student;
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
