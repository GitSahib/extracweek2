package edu.mum.volunteers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.volunteers.configuration.ApplicationContextProvider;
import edu.mum.volunteers.models.Project;
import edu.mum.volunteers.models.User;
import edu.mum.volunteers.repositories.ProjectRepository;
import edu.mum.volunteers.repositories.UserRepository;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @RequestMapping({"/","index.html","index"})
    String index(){
        return "project/index";
    }
    @RequestMapping(value="/save",method=RequestMethod.POST)
    String save(Project project)
    {
    	ProjectRepository projectRepo = ApplicationContextProvider.getApplicationContext().getBean(ProjectRepository.class);
    	
    	projectRepo.save(project);
        return "user/index";
    }
}
