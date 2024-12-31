package com.sgyj.webflux2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @GetMapping("/{id}")
    public PostResponse getPostId(@PathVariable(value= "id") Long id) {
        PostResponse postResponse = new PostResponse();
        postResponse.setId(Long.toString(id));
        postResponse.setContent("hello world");
        return postResponse;
    }

}
