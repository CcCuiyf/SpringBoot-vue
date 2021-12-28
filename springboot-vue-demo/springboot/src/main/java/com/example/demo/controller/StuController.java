package com.example.demo.controller;

import com.example.demo.commen.Result;
import com.example.demo.entity.Stu;
import com.example.demo.mapper.StuMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/stu")
public class StuController {

    @Resource
    StuMapper stuMapper;
    @PostMapping
    public Result<?> save(@RequestBody Stu stu){
        stuMapper.insert(stu);
        return Result.success();
    }
}
