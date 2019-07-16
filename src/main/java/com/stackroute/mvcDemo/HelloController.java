package com.stackroute.mvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//controller class
@Controller
public class HelloController {
    @RequestMapping(value="/hello" , method=RequestMethod.POST)
    //using request param annotation to read the form details
    public String display(@RequestParam("name")String name,@RequestParam("password")String password, Model model) {
        //creating user object
        User user=new User();
        user.setName(name.toString());
        user.setPassword(password.toString());
        user.setMessage(" Welcome " + user.getName() + " to the Stackroute!! ");
        //add a message to the model
        model.addAttribute("message", user.getMessage());
        //returning user.jsp
        return "user";
    }
}
