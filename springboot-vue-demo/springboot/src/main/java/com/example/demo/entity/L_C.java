package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Value;

@TableName("l_c")
@Data
public class L_C {
    @TableId(value = "L_C",type = IdType.AUTO)
    private static Integer L_C;
    private Integer id;
    private Integer sno;
    public L_C(Integer id,Integer sno){
        this.L_C++;
        this.id = id;
        this.sno = sno;
    }


}
