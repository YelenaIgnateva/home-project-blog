package com.itacademy.blog.api;

import com.itacademy.blog.api.mapper.PostMapper;
import com.itacademy.blog.data.entity.Post;
import com.itacademy.blog.services.DTO.PostDTO;
import com.itacademy.blog.services.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@RequestMapping("/post")
public class PostsApiController {
    private final PostService postService;

    @Autowired
    public PostsApiController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        PostDTO createPostDto = PostMapper.INSTANCE.convert(post);
        PostDTO readPostDto = postService.createPost(createPostDto);
        Post returnPost = PostMapper.INSTANCE.convert(readPostDto);
        return new ResponseEntity<Post>(returnPost, HttpStatus.CREATED);
    }
}
