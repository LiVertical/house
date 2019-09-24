package com.wangli.service;

import com.wangli.entity.Student;
import com.wangli.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService{

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> queryStudent(int id){
        return  studentMapper.queryStudent(id);
    }
}
