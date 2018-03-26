package com.kg.customlogging;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * HomeController
 */
@Controller
// @MethodStats
@RequestMapping("/hello")
public class HelloController {
   @MethodStats
    @GetMapping("/helloget")
    public String printHello() {
        System.out.println("printHellohello called");
        //   model.addAttribute("message", "Hello World!!");
          return "index";
       }
     @MethodStats
       @GetMapping("/helloget1")
       public String printHello1() {
           System.out.println("printHellohello1 called");
           //   model.addAttribute("message", "Hello World!!");
             return "index";
          }
}