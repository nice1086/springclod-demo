package com.teachers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QueryteacherDto {
    //教师id
    private String id;
    // 教师名称
    private String teacherName;
}
