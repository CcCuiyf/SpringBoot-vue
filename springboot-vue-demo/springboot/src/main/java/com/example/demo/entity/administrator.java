package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("administrator")
@Data
public class administrator {
    @TableId(value = "sno",type = IdType.AUTO)
    private String sno;
    private String name;
    private String power_id;
    private String pwd;

}
