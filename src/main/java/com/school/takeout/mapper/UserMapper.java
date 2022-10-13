package com.school.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.school.takeout.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
