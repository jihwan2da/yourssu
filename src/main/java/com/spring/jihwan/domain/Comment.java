package com.spring.jihwan.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Comment {
    // @Id : 해당 필드가 Id 이다 라는것을 알려준다.
    @Id
    // @GeneratedValue : 만약 이걸 안해주면 id 를 일일이 추가해줘야되
    // 있으면, 자동으로 더해짐 (보여줄게)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 데이터베이스에 올라갈 항목이다 라는것을 명시
    // (안해줘도 사실 올라가긴함)
    @Column
    private String content;

    @Column
    private String name;
}
