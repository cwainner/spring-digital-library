package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootController {

  @GetMapping("/")
  public ModelAndView index(){
    ModelAndView model = new ModelAndView();
    model.setViewName("index");
    return model;
  }

  @GetMapping("/about")
  public ModelAndView about(){
    ModelAndView model = new ModelAndView();
    model.setViewName("about");
    return model;
  }

  @GetMapping("/contact")
  public ModelAndView contact(){
    ModelAndView model = new ModelAndView();
    model.setViewName("contact");
    return model;
  }
}
