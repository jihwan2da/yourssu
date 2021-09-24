package com.spring.jihwan.repository;

import com.spring.jihwan.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
