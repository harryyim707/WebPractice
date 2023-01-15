package com.example.webpractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Article {
  @Id //대표값 지정
  @GeneratedValue //자동 생성 어노테이션
  private Long id;
  @Column
  private String title;
  @Column
  private String content;
}
