package edu.mum.volunteers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.volunteers.configuration.ApplicationContextProvider;
import edu.mum.volunteers.models.User;
import edu.mum.volunteers.repositories.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping({"/","index.html","index"})
    String index(){
        return "user/index";
    }
    @RequestMapping(value="/signup",method=RequestMethod.POST)
    String signup(User user)
    {
    	UserRepository userRepo = ApplicationContextProvider.getApplicationContext().getBean(UserRepository.class);
    	
    	userRepo.save(user);
        return "user/index1";
    }
}
