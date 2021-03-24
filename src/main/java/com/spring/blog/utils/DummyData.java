package com.spring.blog.utils;

import com.spring.blog.repository.CodeblogRepository;
import com.spring.blog.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {
    @Autowired
    CodeblogRepository codeblogrepository;

    //@PostConstruct  // deixa comentado para não fica gerando post após iniciar a aplicação
    public  void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Fabio");
        post1.setData(LocalDate.now());
        post1.setTitulo("Api Rest");
        post1.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        Post post2 = new Post();
        post2.setAutor("Gilda");
        post2.setData(LocalDate.now());
        post2.setTitulo("Docker");
        post2.setTexto("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = codeblogrepository.save(post);
            System.out.println(postSaved.getId());
        }
    }

}
