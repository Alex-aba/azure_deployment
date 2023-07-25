package com.aba.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

 @GetMapping(value = "/morning")
 public String getString(){
  return "Good Mortning !!!!!";
 }

 @GetMapping(value = "/evening")
 public String getStringEvening(){
  return "Good Evening !!!!!";
 }
}
