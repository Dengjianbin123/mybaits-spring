package com.bjpowernode.dao;

import com.bjpowernode.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudentById(Integer id);

    int insertStudent(Student student);
}
