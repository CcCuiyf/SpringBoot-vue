package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.commen.Result;
import com.example.demo.entity.Stu;
import com.example.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@ResponseBody
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

    //改
    @GetMapping
    public Result<?> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam String search){
        IPage<Stu> userPage = stuMapper.selectPage(new Page<>(pageNum,pageSize), Wrappers.<Stu>lambdaQuery().eq(Stu::getStu_sno,search));
        return Result.success(userPage);
        //return Result.success();
    }
}
