package application.services;

import application.models.Book;

import java.util.List;

public interface IBookService {
  public List<Book> findAll();
}
