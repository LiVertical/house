package com.wangli.mapper;

import com.wangli.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper{

    public List<Student> queryStudent(int id);
}
