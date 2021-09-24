# springstudy

LocalHost 에서 게시판 서버 돌리기

## 2021-08-22
-[x] DB 연동
-[x] Entity 생성
-[ ] 서비스 로직 구현 (Service / Controller / Repository )
-[ ] Postman 확인

## 2021-08-25
-[ ] Postman 설치 및 설명
-[ ] 서비스 로직 구체적 구현 (post, getPostList, 댓글 관련)
-[ ] 웹 연동


### H2 Database 연동
--- DB 생성 과정 ---
1. H2 를 킨다 -> 안키고 Application Run Error : DB 연동안되있다고 에러가 뜬다.
2. jdbc:h2:~/springstudy  입력 : DB를 생성해주는 과정
3. jdbc:h2:tcp://localhost/~/springstudy 입력 : 위에서 생성한 DB에 접속  

--- DB 연동 과정 ---
1. application.yml 에서 datasource 를 추가해준다.
2. url 에 위에서 접속할때 쓰는 url을 입력해준다.
3. username password는 알아서 

* 설명 )  DDL-auto : Application 을 실행하는데 DB를 어떻게 실행할것이냐?  
-> application을 실행했을때 DB를 다 초기화시키고 쓸거냐 (create), 원래 데이터 유지해서 (나머지들..)
  
### Entity (계피셜)
Entity : 객체인데, DB 테이블과 연동이되어 사용되는 객체 특별히 Entity라고 불른다. (씹 계피셜)

### 이렇게 해보세요~!
1. Controller 를 이해하세요.
2. Service 를 이해하세요

