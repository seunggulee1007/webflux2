package com.sgyj.webflux2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @GetMapping("/{id}")
    public PostResponse getPostId(@PathVariable(value= "id") Long id) throws InterruptedException {
        Thread.sleep(3000);
        if(id > 10L ) {
            throw new IllegalArgumentException("id must be less than 10");
        }

        PostResponse postResponse = new PostResponse();
        postResponse.setId(Long.toString(id));
        postResponse.setContent("hello world");
        return postResponse;
    }

}
