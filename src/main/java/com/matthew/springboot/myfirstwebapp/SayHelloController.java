package com.matthew.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, World!";
    }
    
    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello, World!</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello, World!</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

        
    @RequestMapping("/hello-jsp") 
    public String sayHelloJsp() {
        return "sayHello";
    }
    
}
