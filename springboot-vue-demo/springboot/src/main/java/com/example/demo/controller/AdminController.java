package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.commen.Result;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.entity.administrator;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/administrator")
public class AdminController {

    @Resource
    AdminMapper adminMapper;
    @PostMapping("/save")
    public Result<course> save(@RequestBody administrator admin){
        adminMapper.insert(admin);
        return Result.success();
    }
    @GetMapping("/{sno}")
    public Result<administrator> get(@PathVariable Integer sno){
        administrator object = adminMapper.selectById(sno);
        return Result.success(object);
    }
    @PostMapping("/delete")
    public Result<administrator> delete(@PathVariable Integer sno){
        adminMapper.deleteById(sno);
        return Result.success();
    }

    @PostMapping("/Update")
    public Result<administrator> update(@RequestBody administrator admin){
        adminMapper.updateById(admin);
        return Result.success();
    }
}
