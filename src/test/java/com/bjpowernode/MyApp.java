package com.bjpowernode;

import com.bjpowernode.entity.Student;
import com.bjpowernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyApp {
    @Test
    public void test01(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> studentById = service.findStudentById(1001);
        for (Student student:studentById){
            System.out.println(student);
        }
    }

    @Test
    public void test02(){
        String config="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(config);

        StudentService service= (StudentService) ac.getBean("studentService");
        service.addStudent(new Student(1021,"张三二","zhangsan@11.com",20));

    }
}
