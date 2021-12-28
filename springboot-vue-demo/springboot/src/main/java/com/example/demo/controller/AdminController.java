package com.example.demo.controller;

import com.example.demo.commen.Result;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.entity.administrator;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/administrator")
public class AdminController {

    @Resource
    AdminMapper adminMapper;
    @PostMapping
    public Result<?> save(@RequestBody administrator admin){
        adminMapper.insert(admin);
        return Result.success();
    }
}
