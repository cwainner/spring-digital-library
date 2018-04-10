package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooksController {
  @GetMapping("/books")
  public ModelAndView booksList(){
    ModelAndView model = new ModelAndView();
    model.setViewName("books");
    return model;
  }
}
