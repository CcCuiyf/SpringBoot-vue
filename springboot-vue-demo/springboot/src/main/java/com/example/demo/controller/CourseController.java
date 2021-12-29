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
    @PostMapping("/save")
    public Result<course> saveCourse(@RequestBody course cou){
        courseMapper.insert(cou);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result<course> getCourseinf(@PathVariable Integer id){
       course object = courseMapper.selectById(id);
        return Result.success(object);
    }
//    @GetMapping()
//    public Result<List<course>> getCourseinf(){
//        List<course>  courseList = courseMapper.selectList(null);
//        return Result.success(courseList);
//    }
}
