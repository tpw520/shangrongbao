package com.example.shangrongbao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.shangrongbao.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
