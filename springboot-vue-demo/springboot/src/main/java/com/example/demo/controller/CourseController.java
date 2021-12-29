package com.example.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.commen.Result;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @GetMapping
    public Result<?> getCourseinf(@RequestParam String search){
        List<course> courseList = courseMapper.selectList(Wrappers.<course>lambdaQuery().eq(course::getId,search));
        return Result.success(courseList);
    }
}
