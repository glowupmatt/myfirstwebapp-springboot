package com.matthew.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;


    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method = RequestMethod.GET) 
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST) 
    public String goToWelcomePage(@RequestParam String username,
        @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(username, password)) {
            model.put("username", username);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials");
            return "login";
        }
    }
}
