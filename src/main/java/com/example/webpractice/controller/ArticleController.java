package com.example.webpractice.controller;

import com.example.webpractice.dto.ArticleForm;
import com.example.webpractice.repository.ArticleRepository;
import com.example.webpractice.entity.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j //Simple Logging Facade for Java, 로깅을 위한 어노테이션
public class ArticleController {

  @Autowired //스프링 부트가 미리 생성해 놓은 객체를 가져다가 자동 연결
  private ArticleRepository articleRepository;

  @GetMapping("/articles/new")
  public String newArticleForm(){
    return "articles/new";
  }
  @PostMapping("/articles/create")
  public String createArticle(ArticleForm form){
    log.info(form.toString());
//     System.out.println(form.toString()); -> 로깅기능으로 대체

    //1. DTO를 Entity로 변환
    Article article = form.toEntity();
    log.info(article.toString());
//    System.out.println(article.toString());

    //2. Repository에게 Entity를 DB안에 저장하게 함
    Article saved = articleRepository.save(article);
    log.info(saved.toString());
//    System.out.println(saved.toString());
    return "";
  }
}
