package com.example.demo.dto.book;

import com.example.demo.dto.BaseDTO;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GradeDto extends BaseDTO {
    private String name;
}
