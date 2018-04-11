package application.services;

import application.models.Book;
import application.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

  @Autowired
  private BookRepository repository;

  @Override
  public List<Book> findAll() {
    return (List<Book>) repository.findAll();
  }
}
