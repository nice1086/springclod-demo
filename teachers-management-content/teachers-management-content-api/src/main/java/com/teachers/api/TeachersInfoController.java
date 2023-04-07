package com.teachers.api;

import com.teachers.dto.QueryteacherDto;
import com.teachers.entity.User;
import com.teachers.model.PageParams;
import com.teachers.model.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Api(value = "",tags = "")
public class TeachersInfoController {
        @PostMapping("/teacher/list")
        @ApiOperation("教师查询接口")
        public PageResult<User> list(PageParams pageParams, @RequestBody QueryteacherDto queryteacherDto){
            User user = new User();
            user.setId("1");
            PageResult<User> result = new PageResult<>();
            result.setItems(Arrays.asList(user));
            result.setPage(1);
            result.setCounts(1);
            return result;
        }
}
