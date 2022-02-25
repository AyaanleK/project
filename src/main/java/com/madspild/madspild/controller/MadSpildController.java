package com.madspild.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadSpildController {

  @GetMapping("/")
  public String index () {
    return "index";
  }
}
