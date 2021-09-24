package com.spring.jihwan.service;

import com.spring.jihwan.domain.Post;
import com.spring.jihwan.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomainService {

    @Autowired
    private PostRepository postRepository;

    // id를 통해 데이터베이스에 접근을한다.
    // (id 는 컨트롤러 url 에서 가져온것이다.)
    public Post getPost(Long id){

        // Controller 로 부터 받아온 id 를 통해서 Database에 접근을하는데,
        // PostRepository 가 DB에서 받아오는 역할을 한다.
        // findById(id) : DB에서 id에 맞는 데이터를 가져온다.
        // 리턴값은 Optional : 디비에 혹시나 없는 상황을 대비해서 , null 이오면 예외처리
        // 지금은 아직 기초니까, 그냥 get() 을 통해서 Optioncal 무시!
        Post post = postRepository.findById(id).get();

        // 디비로 부터 받아온 데이터를 다시 Controller 로 전송
        return post;
    }

    // 게시글 작성 처리 메소드
    // 다음에 알려줌
    public Long post(Post post){

        // DB 에 저장하는 프로세스
        postRepository.save(post);
        return post.getId();
    }
}
