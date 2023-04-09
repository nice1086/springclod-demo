package com.teachers.service;

import com.teachers.dto.AddTeacherDto;
import com.teachers.dto.QueryteacherDto;
import com.teachers.dto.TeacherInfoDto;
import com.teachers.entity.User;
import com.teachers.model.PageParams;
import com.teachers.model.PageResult;

public interface TeacherService {
    PageResult<User> queryTeacherList(PageParams pageParams, QueryteacherDto queryteacherDto);

    TeacherInfoDto addTeacher(String id,AddTeacherDto addTeacherDto);

    Integer teacherDeleteByName(String name);

    TeacherInfoDto teacherUpdate(String id,AddTeacherDto addTeacherDto);
}
