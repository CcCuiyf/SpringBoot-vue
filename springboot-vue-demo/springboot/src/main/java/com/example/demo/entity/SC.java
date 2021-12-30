package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("s_c")
@Data
public class SC {
    @TableId(value = "sc",type = IdType.AUTO)
    private Integer sc;
    private Integer sno;
    private Integer id;
}
