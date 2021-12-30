package com.example.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.commen.Result;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    CourseMapper courseMapper;
    @PostMapping("/save")
    public Result<course> save(@RequestBody course cou){
        courseMapper.insert(cou);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result<course> get(@PathVariable String id){
       course object = courseMapper.selectById(id);
        return Result.success(object);
    }
    @PostMapping("/delete")
    public Result<course> delete(@PathVariable String id){
        courseMapper.deleteById(id);
        return Result.success();
    }

    @PostMapping("/Update")
    public Result<course> update(@RequestBody course cou){
        courseMapper.updateById(cou);
        return Result.success();
    }

    @GetMapping("/all")
    public Result<List<course>> showall(){
        course c = courseMapper.selectById(1);
        ArrayList<course> clist = new ArrayList<course>();
        int i=1;
        while(c!=null){
            clist.add(c);
            i++;
            c = courseMapper.selectById(i);
        }
        return Result.success(clist);
    }
}
