package com.spring.jihwan.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

// 부모클래스인데, Entity는 아니고, 이걸 상속받은 객체들에 그냥 필드를 추가해준다.
@MappedSuperclass
@Getter

// @EntityListeners : 자동 값 삽입 (날짜를 자동으로 넣어주기위해서)
@EntityListeners(AuditingEntityListener.class)
public abstract class Period {

    // 해당 게시글(댓글) 이 생성된 그 시간이 자동으로 입력이된다.
    @CreatedDate
    @Column
    private LocalDateTime created;

}