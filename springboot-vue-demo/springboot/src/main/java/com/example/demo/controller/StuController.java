package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.commen.Result;
import com.example.demo.entity.*;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.SCMapper;
import com.example.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@ResponseBody
@RestController
@RequestMapping("/stu")
public class StuController {

    @Resource
    StuMapper stuMapper;
    @PostMapping("/save")
    public Result<Stu> save(@RequestBody Stu stu){
        stuMapper.insert(stu);
        return Result.success();
    }
    @GetMapping("/{stu_sno}")
    public Result<Stu> get(@PathVariable Integer stu_sno){
        Stu object =stuMapper.selectById(stu_sno);
        return Result.success(object);
    }
    @PostMapping("/delete")
    public Result<Stu> delete(@PathVariable Integer stu_sno){
        stuMapper.deleteById(stu_sno);
        return Result.success();
    }

    @PostMapping("/Update")
    public Result<Stu> update(@RequestBody Stu stu){
        stuMapper.updateById(stu);
        return Result.success();
    }



}
