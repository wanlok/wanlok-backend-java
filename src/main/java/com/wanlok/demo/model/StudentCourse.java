package com.wanlok.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentCourse {
    @Id
    private Integer student_id;

    @Id
    private Integer course_id;

    public StudentCourse() {

    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }
}
