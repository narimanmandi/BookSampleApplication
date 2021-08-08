package com.example.demo.dto.book;

import com.example.demo.domain.Grade;
import com.example.demo.dto.EntityMapper;
import org.mapstruct.factory.Mappers;

public interface GradeMapper extends EntityMapper<GradeDto, Grade> {

    GradeMapper INSTANCE = Mappers.getMapper(GradeMapper.class);

    @Override
    GradeDto toDto(Grade grade);

    @Override
    Grade toEntity(GradeDto gradeDto);
}
