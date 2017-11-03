package com.ma.test;

import com.ma.entity.Students;
import com.ma.service.StudentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class StudentsTest {
    @Autowired
    private StudentsService studentsService;

    @Test
    public void test(){
        Students students = studentsService.findById(1);
        System.out.println(students.getName());

    }
}
