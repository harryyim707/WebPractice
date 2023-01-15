package com.example.webpractice.repository;

import com.example.webpractice.entity.Article;
import org.springframework.data.repository.CrudRepository;
//CrudRepository<관리 대상 엔티티, 관리 대상 엔티티의 대표값 타입>
public interface ArticleRepository extends CrudRepository<Article,Long> {

}
