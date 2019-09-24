package com.wangli;

import com.alibaba.fastjson.JSON;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.wangli.domain.Teacher;
import com.wangli.repository.TeacherRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class RedisTest {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void test(){
        String teacherJson = redisTemplate.boundValueOps("teachers.findAll").get();
        boolean isRedis = true;
        if(teacherJson == null){
            isRedis  = false;
            List<Teacher> all = teacherRepository.findAll();
            teacherJson = JSON.toJSONString(all);
            redisTemplate.boundValueOps("teachers.findAll").set(teacherJson);
        }
        System.out.println(isRedis ? "是redis缓存中数据":"是数据库中数据");
        System.out.println(teacherJson);
    }
}
