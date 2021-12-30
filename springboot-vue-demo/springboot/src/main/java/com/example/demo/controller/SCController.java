package com.example.demo.controller;

import com.example.demo.commen.Result;
import com.example.demo.entity.SC;
import com.example.demo.entity.Stu;
import com.example.demo.entity.course;
import com.example.demo.entity.showSC;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.SCMapper;
import com.example.demo.mapper.StuMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@ResponseBody
@RestController
@RequestMapping("/stu")
public class SCController {
    @Resource
    SCMapper scMapper;
    @PostMapping("/xuanke")
    public Result<SC> xuanke(@RequestBody SC sc){
        scMapper.insert(sc);
        return Result.success();
    }

    @Resource
    CourseMapper courseMapper;
    @Resource
    StuMapper stuMapper;
    @GetMapping("/xuanke/{sno}")
    public Result<List<showSC>> show(@PathVariable String sno){
        ArrayList<showSC> scs = new ArrayList<showSC>() ;
        showSC show = new showSC();
        int j=0;
        for(int i=1;i<=5;++i){
            SC sc = scMapper.selectById(i);
            if(sc == null) break;
            else if(sc.getSno().equals(sno)){
                Stu stu = stuMapper.selectById(sno);
                course cou = courseMapper.selectById(sc.getId());
                show.setCourse_name(cou.getSubject());
                show.setStu_name(stu.getName());
                scs.add(show);
            }
        }
        return Result.success(scs);
    }
}
