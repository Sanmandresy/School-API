package fr.schoolapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiHealthController {
  @GetMapping("/")
  public String helloThere(){
    return "General Kenobi !";
  }
}
