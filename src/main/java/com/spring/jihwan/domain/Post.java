package com.spring.jihwan.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Post extends Period{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String name;

    @Column
    private String password;

    public Post(String title, String content , String name, String password){
        this.title = title;
        this.content = content;
        this.name = name;
        this.password = password;
    }
}
