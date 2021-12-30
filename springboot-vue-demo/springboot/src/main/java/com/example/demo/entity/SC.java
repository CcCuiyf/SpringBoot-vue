package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("s_c")
@Data
public class SC {
    @TableId(value = "sc",type = IdType.AUTO)
    private String sc;
    private String sno;
    private String id;
}
