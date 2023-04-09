package com.teachers.api;

import com.teachers.dto.AddTeacherDto;
import com.teachers.dto.QueryteacherDto;
import com.teachers.dto.TeacherInfoDto;
import com.teachers.entity.User;
import com.teachers.model.PageParams;
import com.teachers.model.PageResult;
import com.teachers.service.TeacherService;
import com.teachers.service.impl.TeacherServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Api(value = "教师信息编辑接口",tags = "教师信息编辑接口")
public class TeachersInfoController {

        @Autowired
        TeacherService teacherService;

        @PostMapping("/teacher/list")
        @ApiOperation("教师查询接口")
        public PageResult<User> list(PageParams pageParams, @RequestBody @Validated QueryteacherDto queryteacherDto){
            PageResult pageResult = teacherService.queryTeacherList(pageParams, queryteacherDto);
            return pageResult;
        }

        @PostMapping("/teacher/add")
        @ApiOperation("教师新增接口")
        public TeacherInfoDto addTeacher(@RequestBody @Validated AddTeacherDto addTeacherDto){
            //模拟假数据
            String id = "1";
            return teacherService.addTeacher(id,addTeacherDto);
        }

    @PostMapping("/teacher/delete")
    @ApiOperation("教师删除接口")
    public String teacherDeleteByName(@RequestBody String name){

        return ((teacherService.teacherDeleteByName(name) == 1) ? "成功" : "失败");
    }

    @PostMapping("/teacher/update")
    @ApiOperation("教师更新接口")
    public TeacherInfoDto teacherUpdate(@RequestBody String id,@Validated AddTeacherDto addTeacherDto){

        return teacherService.teacherUpdate(id,addTeacherDto);
    }
}
