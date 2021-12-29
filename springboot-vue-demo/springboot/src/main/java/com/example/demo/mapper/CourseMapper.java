package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.course;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;

public interface CourseMapper extends BaseMapper<course> {
    //@Select("select subject from java.course where id=#{id}")
    //course selectId(int id);
}
