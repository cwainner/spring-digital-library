package application.controllers;

import application.models.Book;
import application.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BooksController {

  @Autowired
  IBookService bookService;

  @GetMapping("/books")
  public ModelAndView booksList(){
    ModelAndView model = new ModelAndView();
    model.setViewName("books/books");

    List<Book> books = (List<Book>) bookService.findAll();
    model.addObject("books", books);

    return model;
  }
}
