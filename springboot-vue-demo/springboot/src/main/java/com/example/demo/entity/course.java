package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("course")
@Data
public class course {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String subject;
    private String leader_name;

    public course(Integer id, String subject, String leader_name) {
    }
}
