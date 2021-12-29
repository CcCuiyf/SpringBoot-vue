package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@TableName("student")
@Data
public class Stu {
    @TableId(value = "stu_sno",type = IdType.AUTO)
    private Integer sno;
    private String name;
    private String college;
    private String pwd;

}
