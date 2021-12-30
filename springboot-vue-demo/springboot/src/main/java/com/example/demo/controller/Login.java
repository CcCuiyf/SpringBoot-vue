package com.example.demo.controller;


import com.example.demo.commen.Result;
import com.example.demo.entity.Stu;
import com.example.demo.entity.administrator;
import com.example.demo.entity.leader;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.LeaderMapper;
import com.example.demo.mapper.StuMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class Login {
    @Resource
    StuMapper stuMapper;
    AdminMapper adminMapper;
    LeaderMapper leaderMapper;

    @GetMapping("/{sno}/{pwd}/{user}")
    public Result login(@PathVariable Integer sno,@PathVariable String pwd,@PathVariable String user)
    {
        if(user.equals("student")) {
            Stu stu = stuMapper.selectById(sno);
            if(stu.getPwd().equals(pwd)){
                return Result.success();
            }
        }
        if(user.equals("leader")) {
            leader lead = leaderMapper.selectById(sno);
            if(lead.getPwd().equals(pwd)){
                return Result.success();
            }

        }
        if(user.equals("admin")){
            administrator admin = adminMapper.selectById(sno);
            if(admin.getPwd().equals(pwd)){
                return Result.success();
            }

        }
        else return Result.error("001","Wrong sno or Wrong password");
        return Result.success();
    }

}
