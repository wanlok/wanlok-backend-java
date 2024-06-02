package com.wanlok.demo;

import com.wanlok.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "student", produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.GET})
    //    public MyRequest get(@RequestParam("a") String a, @RequestParam("b") String b) {
    public Iterable<Student> get() {
        return studentRepository.findAll();
    }
}
