package com.spring.blog.service.serviceImpl;

import com.spring.blog.model.Post;
import com.spring.blog.repository.CodeblogRepository;
import com.spring.blog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements  CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() { // retorna lista de posts
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
