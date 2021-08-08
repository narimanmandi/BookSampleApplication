package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book extends BaseEntity{

    public Book(String id){
        this.setId(id);
    }

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn(name = "GRADE_ID", updatable = false, nullable = false)
    private Grade grade;
}