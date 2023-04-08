package com.teachers.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.teachers.dto.AddTeacherDto;
import com.teachers.dto.QueryteacherDto;
import com.teachers.dto.TeacherInfoDto;
import com.teachers.entity.User;
import com.teachers.mapper.TeachersMapper;
import com.teachers.model.PageParams;
import com.teachers.model.PageResult;
import com.teachers.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeachersMapper teachersMapper;

    @Transactional
    @Override
    public PageResult<User> queryTeacherList(PageParams pageParams, QueryteacherDto queryteacherDto) {
        // 构建条件查询器
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        // 构建查询条件：按照教师名称模糊查询
        queryWrapper.like(StringUtils.isNotEmpty(queryteacherDto.getTeacherName()), User::getName, queryteacherDto.getTeacherName());
        // 构建查询条件：按照教师id查询
        queryWrapper.eq(StringUtils.isEmpty(queryteacherDto.getId()),User::getId,queryteacherDto.getId());
        // 分页对象
        Page<User> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
        // 查询数据内容获得结果
        Page<User> pageInfo = teachersMapper.selectPage(page,queryWrapper);
        // 获取数据列表
        List<User> items = pageInfo.getRecords();
        // 获取数据总条数
        long counts = pageInfo.getTotal();
        // 构建结果集
        return new PageResult<>(items, counts, pageParams.getPageNo(), pageParams.getPageSize());
    }

    @Transactional
    @Override
    public TeacherInfoDto addTeacher(String id,AddTeacherDto addTeacherDto) {
        // 1. 合法性校验
        if (StringUtils.isBlank(addTeacherDto.getId())) {
            throw new RuntimeException("id为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getName())) {
            throw new RuntimeException("名称为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getImage())) {
            throw new RuntimeException("图片为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getIntro())) {
            throw new RuntimeException("简介为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getMotto())) {
            throw new RuntimeException("座右铭为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getNickname())) {
            throw new RuntimeException("昵称为空");
        }
        if (StringUtils.isBlank(addTeacherDto.getPosition())) {
            throw new RuntimeException("职位为空");
        }
        return null;
    }
}
