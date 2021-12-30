package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.commen.Result;
import com.example.demo.entity.Stu;
import com.example.demo.entity.administrator;
import com.example.demo.entity.leader;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.LeaderMapper;
import com.example.demo.mapper.StuMapper;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Login;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Resource
    StuMapper stuMapper;
    AdminMapper adminMapper;
    LeaderMapper leaderMapper;

    @GetMapping
    public Result login(@RequestBody Login login)
    {
        if(login.getUser().equals("student")) {
        //System.out.println(login.getSno());
        Stu stu = stuMapper.selectById(login.getSno());
        if(stu == null){
            return Result.error("002","user does not exist!");
        }
        if(stu.getPwd().equals(login.getPwd())){
            return Result.success();
        }
    }
        if(login.getUser().equals("leader")) {
            leader lead = leaderMapper.selectById(login.getSno());
            if(lead == null){
                return Result.error("002","user does not exist!");
            }
            if(lead.getPwd().equals(login.getPwd())){
                return Result.success();
            }

        }
        if(login.getUser().equals("admin")){
            administrator admin = adminMapper.selectById(login.getSno());
            if(admin == null){
                return Result.error("002","user does not exist!");
            }
            if(admin.getPwd().equals(login.getPwd())){
                return Result.success();
            }

        }
        else return Result.error("001","Wrong sno or Wrong password");
        return Result.success();
    }

}
