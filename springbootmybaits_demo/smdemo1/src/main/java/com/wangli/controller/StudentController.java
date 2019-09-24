package com.wangli.controller;

import com.wangli.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wangli")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("welcome/{id}")
    public String welcome(@PathVariable int id){
        return studentService.queryStudent(id).toString();
    }

}
