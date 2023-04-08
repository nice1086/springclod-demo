package com.teachers.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.teachers.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeachersMapper extends BaseMapper<User> {
}
