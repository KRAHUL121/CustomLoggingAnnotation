package com.kg.customlogging;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeController
 */
@MethodStats
 @Controller
@RequestMapping("api/events")

public class HomeController {
    // @MethodStats
       @GetMapping("/get")
    public String printHello() {
        System.out.println("printHello called");
        //   model.addAttribute("message", "Hello World!!");
          return "index";
       }
    //   @MethodStats
       @GetMapping("/get1")
       public String printHello1() {
           System.out.println("printHello1 called");
           //   model.addAttribute("message", "Hello World!!");
             return "index";
          }
}