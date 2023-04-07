package com.teachers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QueryteacherDto {
    // 审核状态
    private String auditStatus;
    // 教师名称
    private String teacherName;
    // 发布状态
    private String publishStatus;
}
