package com.teachers.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.teachers.dto.AddTeacherDto;
import com.teachers.dto.TeacherInfoDto;
import com.teachers.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TeachersMapper extends BaseMapper<User> {
    Integer userDeleteByName(@Param("name") String name);

    TeacherInfoDto teacherUpdate(@Param("id") String id,@Param("name")String name,
                                 @Param("nickname")String nickname,
                                 @Param("image")String image,@Param("position")String position,
                                 @Param("motto")String motto,@Param("intro")String intro);

    User getById(@Param("id") String id);
}
