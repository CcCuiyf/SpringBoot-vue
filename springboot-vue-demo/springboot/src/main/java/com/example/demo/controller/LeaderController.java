package com.example.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.commen.Result;
import com.example.demo.entity.leader;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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
    @GetMapping
    public Result<?> getLeaderinf(@RequestParam String search){
        List<leader> leaderList = leaderMapper.selectList(Wrappers.<leader>lambdaQuery().eq(leader::getLeader_sno,search));
        return Result.success(leaderList);
    }
}
