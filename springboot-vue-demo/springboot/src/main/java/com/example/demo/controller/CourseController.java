package com.example.demo.controller;

import com.example.demo.commen.Result;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    CourseMapper courseMapper;
    @PostMapping
    public Result<?> save(@RequestBody course course){
        courseMapper.insert(course);
        return Result.success();
    }
}
