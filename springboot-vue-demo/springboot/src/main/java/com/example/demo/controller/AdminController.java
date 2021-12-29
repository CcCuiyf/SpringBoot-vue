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
    @PostMapping
    public Result<?> save(@RequestBody administrator admin){
        adminMapper.insert(admin);
        return Result.success();
    }
    @GetMapping
    public Result<?> getAdmininf(@RequestParam String search){
        List<administrator> adminList =  adminMapper.selectList(Wrappers.<administrator>lambdaQuery().eq(administrator::getSno,search));
        return Result.success(adminList);
    }
}
