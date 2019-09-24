package com.wanglitest;

import com.wangli.Smdemo1Application;
import com.wangli.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= Smdemo1Application.class)
public class MybaitsTest {

    @Autowired
    public StudentService studentService;

    @Test
    public void test(){
        System.out.println(studentService.queryStudent(1));
    }
}
