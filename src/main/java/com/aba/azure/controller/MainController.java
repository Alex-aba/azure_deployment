package com.aba.azure.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

 @Value("${greetings}")
 private String greetings;

 @GetMapping(value = "/morning")
 public String getString(){
  return "Good Morning GitHub from " + greetings + "!!!!!" ;
 }

 @GetMapping(value = "/evening")
 public String getStringEvening(){
  return "Good Evening GitHub from " + greetings + "!!!!!";
 }
}
