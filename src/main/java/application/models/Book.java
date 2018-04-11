package application.models;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;

  private String author;

  private float reviewScore;

  private int stock;

  public Book(String title, String author, int stock){
    this.title = title;
    this.author = author;
    this.stock = stock;
    this.reviewScore = 0;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public float getReviewScore() {
    return reviewScore;
  }

  public int getStock() {
    return stock;
  }
}
