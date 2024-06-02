package com.wanlok.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "student_id")
    @JsonProperty("student_id")
    private Integer studentId;

    @Column(name = "student_name")
    @JsonProperty("student_name")
    private String studentName;

//    @OneToMany
//    @JoinColumn(name="student_id")
//    private List<StudentCourse> studentCourses;

    @ManyToMany(targetEntity = Course.class, cascade = { CascadeType.ALL })
    @JoinTable(
        name = "student_course",
        joinColumns = { @JoinColumn(name = "student_id") },
        inverseJoinColumns = { @JoinColumn(name = "course_id") }
    )
    @JsonProperty("courses")
    private List<Course> courses;

    public Student() {

    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

//    public List<StudentCourse> getStudentCourses() {
//        return studentCourses;
//    }
//
//    public void setStudentCourses(List<StudentCourse> studentCourses) {
//        this.studentCourses = studentCourses;
//    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
