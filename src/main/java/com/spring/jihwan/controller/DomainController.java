package com.spring.jihwan.controller;

import com.spring.jihwan.domain.Post;
import com.spring.jihwan.request.PostRequest;
import com.spring.jihwan.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *  Controller 는 서버-클라이언트간의 연결만 담당
 *  1. 요청을 받고
 *  2. 대답을 하고
 *
 *  요청 (Controller) - 처리 (Service) - 대답 (Controller)
 */
@RestController
// @RestController 와 @Controller 의 차이이ㅏㄷ.
/**
 *  뭘 더 많이 쓰냐?
 *  -> RestController
 *
 *  서버에서 만들어서 보내주면 프런트에서 처리 (처리를 프런트와 나눠서 한다.)
 * @RestController : 리턴이 데이터 (JSON) : Client - side
 *
 * MVC를 쓰는이유는?
 * 프런트개발자가 없어, js 를 못해! -> mvc (처리를 서버에서 다 한다.)
 * @Controller : 리턴이 페이지 (페이지로 이동) : Server - side  (MVC)
 *
 */
public class DomainController {

    @Autowired
    private DomainService domainService;

    // 게시글을 작성하기
    @PostMapping("/")
    public Long post(@RequestBody PostRequest postRequest){
        // Reuqest 변수 관련해서도 다음시간에..
        Post post = new Post(postRequest.getTitle(),
                postRequest.getContent(),
                postRequest.getName(),
                postRequest.getPassword())
                ;

        return domainService.post(post);
    }

    // 단일 게시글을 조회하기
    @GetMapping("/{postId}")
    public Post getPost(@PathVariable("postId") Long id){
        return domainService.getPost(id);
    }

    // 게시글 리스트를 조회하기
    @GetMapping("/")
    public List<Post> getPostList(){
        return null;
    }
}
