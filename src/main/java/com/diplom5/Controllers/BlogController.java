package com.diplom5.Controllers;


import com.diplom5.entity.User;
import com.diplom5.repository.UserRepo;
import com.diplom5.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class BlogController {

    @RequestMapping(value = "/blog", method = RequestMethod.GET)
    public String blogView() {
        return "blog";
    }

}