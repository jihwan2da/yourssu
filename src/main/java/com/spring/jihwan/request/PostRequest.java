package com.spring.jihwan.request;

import lombok.Data;

@Data
public class PostRequest {
    private String title;
    private String content;
    private String name;
    private String password;
}
