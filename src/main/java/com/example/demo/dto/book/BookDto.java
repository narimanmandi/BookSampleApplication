package com.example.demo.dto.book;

import com.example.demo.dto.BaseDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto extends BaseDTO {

    private String title;
    private String author;
    private String gradeId;
    private String gradeName;

}
