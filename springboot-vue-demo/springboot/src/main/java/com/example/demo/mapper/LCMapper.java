package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.L_C;
import org.apache.ibatis.annotations.Select;

public interface LCMapper extends BaseMapper<L_C> {
    //@Select("SELECT 'leader_id'.*,c")
}
