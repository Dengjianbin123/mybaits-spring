package com.bjpowernode.service;

import com.bjpowernode.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findStudentById(Integer id);

    int addStudent(Student student);
}
