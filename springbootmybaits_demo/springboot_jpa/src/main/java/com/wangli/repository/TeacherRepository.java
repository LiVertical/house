package com.wangli.repository;

import com.wangli.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    public List<Teacher> findAll();
}
