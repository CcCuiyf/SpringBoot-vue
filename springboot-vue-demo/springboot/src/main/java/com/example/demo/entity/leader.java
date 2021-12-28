package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("leader")
@Data
public class leader {
    @TableId(value = "leader_sno",type = IdType.AUTO)
    private String name;
    private Integer leader_sno;
    private String college;
    private String pwd;

}
