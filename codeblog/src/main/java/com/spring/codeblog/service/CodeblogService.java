package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    // lista todos os posts
    List<Post> findAll();

    //lista os posts por ID
    Post findById(Long id);

    // salva o post
    Post save(Post post);

}
