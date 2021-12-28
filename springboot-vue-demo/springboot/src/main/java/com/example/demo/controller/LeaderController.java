package com.example.demo.controller;

import com.example.demo.commen.Result;
import com.example.demo.entity.leader;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/leader")
public class LeaderController {

    @Resource
    LeaderMapper leaderMapper;
    @PostMapping
    public Result<?> save(@RequestBody leader leader){
        leaderMapper.insert(leader);
        return Result.success();
    }
}
