package com.example.demo.dto.book;

import com.example.demo.domain.Book;
import com.example.demo.dto.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<BookDto, Book> {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Override
    @Mapping(target = "gradeId", source = "grade.id")
    @Mapping(target = "gradeName", source = "grade.name")
    BookDto toDto(Book entity);


    @Override
    @Mapping(target = "grade.id", source = "gradeId")
    Book toEntity(BookDto dto);
}
