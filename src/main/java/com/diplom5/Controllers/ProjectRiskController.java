package com.diplom5.Controllers;

import com.diplom5.entity.ProjectRisk;
import com.diplom5.repository.ProjectRiskRepo;
import com.diplom5.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectRiskController {

    @Autowired
    ProjectRiskRepo projectRiskRepo;

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/addProject", method = RequestMethod.GET)
    public String showRegistration(Model model) {
        model.addAttribute("project", new ProjectRisk());
        return "addProject";
    }

    @RequestMapping(value="/addProject", method=RequestMethod.POST)
    public String processRegistration(ProjectRisk projectRisk) {
        projectRiskRepo.save(projectRisk);
        return "redirect:/"
                + projectRisk.getProjectName();
    }
//    @RequestMapping(value="/{projectName}", method=RequestMethod.GET)
//    public String showUserProfile(
//            @PathVariable String projectName, Model model) {
//        ProjectRisk projectRisk = projectRiskRepo.findByProjectName(projectName);
//        model.addAttribute(projectRisk);
//        return "/";
//    }
}
