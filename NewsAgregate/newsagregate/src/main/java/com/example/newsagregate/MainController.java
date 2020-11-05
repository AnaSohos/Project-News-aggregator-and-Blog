package com.example.newsagregate;

import com.example.newsagregate.model.NewsBlog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "index";
    }


    @GetMapping("/blog")
    public String blog(Model model) {
          model.addAttribute("blogs", GreetingController.list);
        return "blog";
    }

}
