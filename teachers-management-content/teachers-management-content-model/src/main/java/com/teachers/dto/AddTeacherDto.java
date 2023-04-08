package com.teachers.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "AddTeacherDto",description = "新增教师基本信息")
public class AddTeacherDto {
    @ApiModelProperty(value = "id", required = true)
    private String id;

    @ApiModelProperty(value = "教师名称", required = true)
    private String name;

    @ApiModelProperty(value = "昵称", required = true)
    private String nickname;

    @ApiModelProperty(value = "头像", required = true)
    private String image;

    @ApiModelProperty(value = "职位", required = true)
    private String position;

    @ApiModelProperty(value = "座右铭", required = true)
    private String motto;

    @ApiModelProperty(value = "简介", required = true)
    private String intro;
}
