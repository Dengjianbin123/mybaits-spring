package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.entity.Student;
import com.bjpowernode.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findStudentById(Integer id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }
}
