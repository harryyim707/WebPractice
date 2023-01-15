package com.example.webpractice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
  @GetMapping("/hi")
  public String niceToMeetYou(Model model){
    model.addAttribute("username", "Harry");
    return "greetings"; //보여 줄 View 페이지
  }
  @GetMapping("/bye")
  public String seeYouNext(Model model){
    model.addAttribute("nickname", "홍길동");
    return "goodbye";
  }
}
