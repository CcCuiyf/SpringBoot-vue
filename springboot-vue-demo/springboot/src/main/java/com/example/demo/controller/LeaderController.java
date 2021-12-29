package com.example.demo.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.commen.Result;
import com.example.demo.entity.L_C;
import com.example.demo.entity.course;
import com.example.demo.entity.leader;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.LCMapper;
import com.example.demo.mapper.LeaderMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/leader")
public class LeaderController {

    @Resource
    LeaderMapper leaderMapper;
    @PostMapping("/save")
    public Result<leader> save(@RequestBody leader lead){
        leaderMapper.insert(lead);
        return Result.success();
    }

    @GetMapping("/{leader_sno}")
    public Result<leader> get(@PathVariable Integer leader_sno){
        leader object = leaderMapper.selectById(leader_sno);
        return Result.success(object);
    }

    @PostMapping("/delete")
    public Result<leader> delete(@PathVariable Integer leader_sno){
        leaderMapper.deleteById(leader_sno);
        return Result.success();
    }

    @PostMapping("/Update")
    public Result<leader> update(@RequestBody leader lead){
        leaderMapper.updateById(lead);
        return Result.success();
    }

    LCMapper lcMapper;
    CourseMapper courseMapper;

//    @PostMapping("/addCourse")
//    //教师姓名、课程名称、教师编号、课程编号
//    public Result<L_C> addCourse(@PathVariable String lname,@PathVariable String sub,@PathVariable Integer leader_sno,@PathVariable Integer cid){
//        L_C lc = new L_C(leader_sno,cid);
//        lcMapper.insert(lc);
//        Integer cNum = courseMapper.Count();
//        course c = new course(cid,sub,lname);
//        courseMapper.insert(c);
//        return Result.success();
//    }

//    @GetMapping("/displayCourse")
//    public Result<L_C> display(@RequestParam L_C lc,@PathVariable Integer leader_sno){
//        //List<L_C> lcList = lcMapper.selectList(Wrappers.lambdaQuery().<L_C>eq(L_C::getSno,leader_sno));
//        return Result.success(lcList);
//    }

}
